import{test, expect} from '@playwright/test'

test('Table', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    const table = await page.locator('#productTable')
    
    // 1.Validate columns and rows count
    const columns = table.locator('thead tr th')
    console.log(`Colulms are : ${await columns.count()}`)
    expect(await columns.count()).toBe(4)
    
    const rows = table.locator('tbody tr')
    console.log(`Rows are : ${await rows.count()}`)
    expect(await rows.count()).toBe(5)

    // 2. Select checkbox for 4 product
    const matchedProduct = rows.filter({
        has: page.locator('td'),
        hasText : 'Smartwatch'
    })
    await matchedProduct.locator('input').click()

    // 3. Select multiple product
    selectProduct(rows, page, 'Laptop')
    selectProduct(rows, page, 'Wireless Earbuds')

    // 4.Print table data using loop
    for(let i=0; i<await rows.count(); i++){
        const row = rows.nth(i)
        const tds = row.locator('td')
        for(let j=0; j<await tds.count()-1; j++){
            console.log(await tds.nth(j).textContent())
        }
    }

    // 5. Print table data for all pages
    const pages = page.locator('#pagination li a')
    for(let p=0; p<await pages.count(); p++){
        if(p>0){
            await pages.nth(p).click()
        }
      printTable(rows, page)
      await page.waitForTimeout(3000)
    }

    await page.waitForTimeout(3000)
    await page.close()
})

// async fnc
async function selectProduct(rows, page, name){
    const matchedProduct = rows.filter({
        has: page.locator('td'),
        hasText : name
    })
    await matchedProduct.locator('input').click()
}

async function printTable(rows, page) {
      for(let i=0; i<await rows.count(); i++){
            const row = rows.nth(i)
            const tds = row.locator('td')
            for(let j=0; j<await tds.count()-1; j++){
                console.log(await tds.nth(j).textContent())
            }
        }
}