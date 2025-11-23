import {test, expect} from '@playwright/test';

test('Locator', async({page})=>{
    await page.goto('https://opensource-demo.orangehrmlive.com/');
    
    //Fill the username
    await page.fill('input[placeholder="Username"]' , 'Admin');

    // fill the password
    await page.fill('input[placeholder="Password"]', 'admin123')

    // click login
    await page.click('button[type="submit"]');

    // click dropdown
    await page.click('.oxd-userdropdown-name');

    // validate logout button
    const logoutBtn = await page.locator('a:has-text("Logout")');
    await expect(logoutBtn).toBeVisible();

    // click 0on logout
    await page.click('a:has-text("Logout")');

    // close page
    await page.close();
})