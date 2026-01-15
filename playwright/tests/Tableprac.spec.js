import { test, expect } from "@playwright/test";

test('Table', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')
    
    const table = page.locator("table[name='BookTable']")

    const rows = table.locator('tbody tr')
    const cols = table.locator('tbody tr th')
    console.log(`Rows are : ${await rows.count()}`)
    console.log(`Column are : ${await cols.count()}`)


    // const text =await getCellText(table, 5, 1)
    // console.log(text)

    for(let i=0; i<await rows.count(); i++){
        let row = rows.nth(i)
        let col = row.locator('td')
        for(let j=0; j<await col.count(); j++){
            console.log(await col.nth(j).textContent())
        }
    }

    await page.waitForTimeout(3000)
    await page.close()
})

async function getCellText(table, row , col) {
    const cell =await table.locator('tbody tr').nth(row).locator('td').nth(col);
    return await cell.textContent()
}

test.only('Book with high price', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')
    
    const table = page.locator("//table[@name='BookTable']")
    let highestPrice = 0;
    let highestPriceBook = '';

    const rows = table.locator('tbody tr');
    const cols = table.locator('tbody tr th');
    for(let i=0; i<await rows.count(); i++){
        let row = rows.nth(i);
        
        const bookName = await row.locator('td').nth(0).textContent();
        const priceText = await row.locator('td').nth(3).textContent();

        const price = Number(priceText.trim());

        if(price>highestPrice){
            highestPrice = price;
            highestPriceBook = bookName.trim();
        }
    }
    console.log(`Highest Price: ${highestPrice}`);
   console.log(`Book Name with Highest Price: ${highestPriceBook}`);
})