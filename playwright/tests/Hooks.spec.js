import {test, expect} from '@playwright/test'

let page
test.beforeAll('Login', async({browser})=>{
    page =await  browser.newPage()
    await page.goto('https://practicetestautomation.com/practice-test-login/')
    await page.locator('#username').fill('student')
    await page.locator('#password').fill('Password123')
    await page.locator('#submit').click()
})

test.afterAll('Log out', async()=>{
    const logout = page.locator("a:has-text('Log out')");
    try{
        if(await logout.isVisible()){
            await logout.click();
            await expect(page).toHaveURL(/practice-test-login/);
        }
    } catch (err) {
    // swallow errors in teardown but log them so you can debug if needed
    console.warn('Logout failed (ignored):', err);
  }
})

test('Login validation', async()=>{
    await expect(page.locator('.post-title')).toHaveText('Logged In Successfully');
});
