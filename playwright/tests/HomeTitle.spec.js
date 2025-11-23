import {test, expect} from '@playwright/test';

test('HomePage', async({page})=>{

    await page.goto('https://automationexercise.com/');
    const pageTitle =await page.title();
    console.log(`Page Title is : ${pageTitle}`);

    await expect(page).toHaveTitle('Automation Exercise');

    const pageUrl = page.url();
    console.log(`Page URL is : ${pageUrl}`);

    await expect(page).toHaveURL('https://automationexercise.com/')
    await page.close();
})