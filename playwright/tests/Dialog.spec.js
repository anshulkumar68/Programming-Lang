import {test, expect} from '@playwright/test';

// SIMPLE ALERT
test.skip('ALERT', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    //Enable Dialog
    page.on('dialog', async dialog =>{
        expect(dialog.type()).toContain('alert')
        expect(dialog.message()).toContain('I am an alert box!')
        await dialog.accept();
    })

    await page.getByText('Simple Alert').click()
    await page.waitForTimeout(3000);
    await page.close()
})

// CONFIRMATION ALERT
test('CONFIRMATION', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    const shouldAccept = true;
    //Enable Dialog
    page.on('dialog', async dialog =>{
        expect(dialog.type()).toContain('confirm')
        expect(dialog.message()).toContain('Press a button!')
        if(shouldAccept) await dialog.accept()
        else await dialog.dismiss()
    })

    await page.getByText('Confirmation Alert').click()
    const expectedText = shouldAccept ? 'You pressed OK!' : 'You pressed Cancel!'
    expect(page.locator('#demo')).toHaveText(expectedText)

    await page.waitForTimeout(5000);
    await page.close()
})

// PROMPT ALERT
test.skip('PROMPT', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    //Enable Dialog
    page.on('dialog', async dialog =>{
        expect(dialog.type()).toContain('prompt')
        expect(dialog.message()).toContain('Please enter your name:')
        expect(dialog.defaultValue()).toContain('Harry Potter')
        await dialog.accept('Anshul')
        // await dialog.dismiss()
    })

    await page.getByText('Prompt Alert').click()
    expect(page.locator('#demo')).toHaveText('Hello Anshul! How are you today?')

    await page.waitForTimeout(3000);
    await page.close()
})