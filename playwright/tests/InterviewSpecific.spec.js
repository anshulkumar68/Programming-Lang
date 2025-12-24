import {test, expect} from '@playwright/test'

test('Interview specific question', async({page})=>{
    
    // Download file
    const [download] = await Promise.all([
        page.waitForEvent('download'),
        page.locator('#downloadBtn').click()
    ])
    download.saveAs('downlaods/report.pdf')

    //New page
    const [page] = await Promise.all([
        context.waitForEvent('page'),
        page.click('#newUrl')
    ])
    await page.waitForLoadState()

    //create new page from browser
    const context = await browser.newContext();
    const page = await context.newPage();

    //upload a file
    page.locator('#fileUpload').setInputFiles('data/test.pdf')

    // How do you handle dialog boxes (alert/confirm/prompt)?
    page.on('dialog', async dialog =>{
        await dialog.accept(); 
        await dialog.reject();
    })

    // How do you handle iframes?
    const frame = page.frame({ name: 'myFrame' });
    await frame.fill('#email', 'test@mail.com');

    // How do you wait for navigation after a click?
    await Promise.all([
    page.waitForNavigation(),
    page.click('#login'),
    ]);

    //How to handle multiple pages
    const pages = context.pages();
    await pages[1].bringToFront();

    // How do you take a screenshot?
    await page.screenshot({ path: 'page.png' });

    // How do you wait for an element to appear?
    await page.waitForSelector('#result');
})
