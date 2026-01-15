import {test, expect} from '@playwright/test'

// At Blank 1: Click a button to open a pop-up. Use the correct selector for the button.
// At Blank 2: Retrieve the title of the pop-up window and store it in a variable. Ensure the pop-up is fully loaded before accessing the title.
// At Blank 3: Fill in a text field inside the pop-up window. Replace '______' with the appropriate selector for the input field.
// At Blank 4: Click the submit button inside the pop-up. Replace '______' with the correct selector for the button.
// At Blank 5: Accept the confirmation dialog once the form is submitted. Replace '______' with the correct code to handle the confirmation dialog.

test.only('Practice pop-up',async ({page, context})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')
    //blank 1 
    await page.locator('#btn').click();
    const popup = await context.waitForEvent('page')
    //blank 2
    await popup.waitForLoadState('domcontentloaded');
    const title = await popup.title()
    console.log(title)
    //blank 5
    popup.on('dialog', async dialog =>{
        await dialog.reject();
    })
    //blank 3
    await popup.locator('#input').fill('Hey! there');
    //blank 4
    await popup.locator('#submit').click();
})

// test('Interview specific question', async({page})=>{    
//     // Download file
//     const [download] = await Promise.all([
//         page.waitForEvent('download'),
//         page.locator('#downloadBtn').click()
//     ])
//     download.saveAs('downlaods/report.pdf')

//     //New page
//     const [page] = await Promise.all([
//         context.waitForEvent('page'),
//         page.click('#newUrl')
//     ])
//     await page.waitForLoadState()

//     //create new page from browser
//     const context = await browser.newContext();
//     // const page = await context.newPage();

//     //upload a file
//     page.locator('#fileUpload').setInputFiles('data/test.pdf')

//     // How do you handle dialog boxes (alert/confirm/prompt)?
//     page.on('dialog', async dialog =>{
//         await dialog.accept(); 
//         await dialog.reject();
//     })

//     // How do you handle iframes?
//     const frame = page.frame({ name: 'myFrame' });
//     await frame.fill('#email', 'test@mail.com');

//     // How do you wait for navigation after a click?
//     await Promise.all([
//     page.waitForNavigation(),
//     page.click('#login'),
//     ]);

//     //How to handle multiple pages
//     const pages = context.pages();
//     await pages[1].bringToFront();

//     // How do you take a screenshot?
//     await page.screenshot({ path: 'page.png' });

//     // How do you wait for an element to appear?
//     await page.waitForSelector('#result');
// })
