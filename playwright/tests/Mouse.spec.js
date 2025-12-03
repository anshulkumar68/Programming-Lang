import {test, expect} from '@playwright/test';

test('Mouse Hover', async({page})=>{

    await page.goto('https://www.flipkart.com/');
    
    const login = await page.locator("//span[@class='_1XjE3T']/span[normalize-space()='Fashion']").hover()
    await page.locator("//a[normalize-space()='Men Footwear']").click()
    
    await page.waitForTimeout(4000)
    await page.close();
})

test('Mouse Right-click', async({page})=>{

    await page.goto('https://swisnl.github.io/jQuery-contextMenu/demo.html');
    
    const btn = await page.locator("//span[contains(text(), 'right click me')]");
    btn.click({button : 'right'});

    page.locator('.context-menu-item.context-menu-icon.context-menu-icon-copy').hover();
    await page.waitForTimeout(4000)
    await page.close();
})

test.only('Mouse Double-click', async({page})=>{

    await page.goto('https://testautomationpractice.blogspot.com/');
    
    const btn = page.locator("button[ondblclick='myFunction1()']");
    btn.dblclick();
    const field1 =await page.locator('#field1').inputValue()
    console.log(`value is :${field1}`);
    expect(page.locator('#field2')).toHaveValue(field1)

    await page.waitForTimeout(4000)
    await page.close();
})
