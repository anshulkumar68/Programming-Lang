import {test, expect} from '@playwright/test';

test('Assertion', async({page})=>{

    await page.goto('https://demo.nopcommerce.com/')
    await expect.toHaveTitle('nopCommerce demo store. Login')
    await expect.toHaveURL('https://demo.nopcommerce.com/')
    await page.getByRole('link', {name:"Register"}).click()
    const checkButton = page.getByRole('checkbox', { name: 'Newsletter' })
    await expect(checkButton).toBeChecked();
    const pwdAttribute = page.getByLabel('Password')
    await expect(pwdAttribute).toHaveAttribute('name','password');
})