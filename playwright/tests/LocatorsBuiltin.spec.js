import {test, expect} from '@playwright/test'

test('Locators-Built-in', async({page})=>{

    await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

    const logo = page.getByAltText('company-branding');
    await expect(logo).toBeVisible();

    await page.getByPlaceholder('Username').fill('Admin');
    await page.getByPlaceholder('Password').fill('admin123');

    await page.getByRole('button', {type:'submit'}).click()

    const username = await page.locator('.oxd-userdropdown-name').textContent();
    await expect(page.getByText(username)).toBeVisible();
    console.log(username);
})

/*
import {test, expect} from '@playwright/test'

test('Exercise', async({page})=>{
    await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
    // exercise 1
    page.getByAltText('company-branding')
    page.getByPlaceholder('Username');
    page.getByPlaceholder('Password');
    page.getByRole('button', {name:'Login'}).click();
    page.locator('button[type="submit"]')
    page.locator('button[text(),"submit"]')
    page.locator(':has-text[submit]')
    await page.getByRole('button', {name:'Login'}).click(); //duplicate
    
    //exercise 2
    page.getByRole('paragraph', {name:'dropdown'})
    const username = page.getByText('value-4794 value-6774');
    page.locator('.oxd-userdropdown-name')
    page.locator('.oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon')
    await expect(username).toBeVisible();

    //exercise 3
    await page.getByRole('menuitem', {name:"logout"}).click()
    page. getByText('Logout')   
    page.locator('a:has-text("Logout")')

    //Exercise 4
    await page.getByRole('button', {name:'Login'}).click(); //duplicate
    page.getByRole('link', {name:'My Info'})
    page.getByText('My Info')
    page.locator('body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(6) > a:nth-child(1)')
    //locator chaining DK
    page.locator('a:has-text("My Info")');
})
*/