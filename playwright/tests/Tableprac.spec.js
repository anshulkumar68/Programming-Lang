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