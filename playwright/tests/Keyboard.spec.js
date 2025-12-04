import {test, expect} from '@playwright/test'

test('Keyboard', async({page})=>{
    await page.goto('https://gotranscript.com/text-compare')

    const input1 = page.locator("textarea[name='text1']").fill('Welcome to automation!')
    const input2 = page.locator("textarea[name='text2']")

    
    await page.keyboard.press('Control+A')
    await page.keyboard.press('Control+C')
    await page.keyboard.down('Tab')
    await page.keyboard.up('Tab')
    await page.keyboard.press('Control+V')

    await page.waitForTimeout(3000)
    await page.close()    
})