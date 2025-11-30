import {test, expect} from '@playwright/test'

test('Dropdown', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    //=> Ways of selecting opt from dropdown
    // page.locator('#country').selectOption('India');
    // page.locator('#country').selectOption({value : 'India'});
    // page.locator('#country').selectOption({index : 4});
    // page.selectOption('#country', 'India');
    const countries = await page.$$('#country option');
    for(let country of countries){
        let text = await country.textContent();
        // console.log(text.trim())
        if(text.trim() === 'Japan'){
            await page.selectOption('#country',{value : 'japan'})
            break;
        }
    }
    
    // => Types of Assertion
    // 1. Number of options in dropdown => using toHaveCount 
    const options = page.locator('#country option')
    await expect(options).toHaveCount(10);
   
    //2. Number of options in dropdown => using loop
    const options2 =await page.$$('#country option')
    for(let option of options2){
        let text =await option.textContent()
        console.log(text.trim())
    }
    expect(options2.length).toBe(10)

    // 3. Validate presence of value in dropdown => 
    const options3 =await page.locator('#country').textContent()
    expect(options3.includes('France')).toBeTruthy()

    // 4. Validate presence of value in dropdown => using loop
    const options5 = await page.$$('#country option')
    let status = false
    for(let option of options5){
        let text = await option.textContent()
        if(text.includes('Germany')){
            status = true;
            break;
        }
    }
    expect(status).toBeTruthy()

    await page.waitForTimeout(3000);
    page.close();
})

test('Dropdown Multiselection', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    // await page.selectOption('#colors', ['Red', 'Green', 'Yellow']);
    await page.locator('#colors').selectOption(['Red', 'Green', 'Yellow']);
    
    //Assertions
    // validate length
    const colors = await page.locator('#colors option')
    await expect(colors).toHaveCount(7)
    
    const colors2 = await page.$$('#colors option')
    console.log(`Length is : ${colors2.length}`)
    expect(colors2.length).toBe(7)
    for(let color of colors2){
        let text = await color.textContent()
        console.log(`color are : ${text.trim()}`)
    }

    // validate color presence
    const colors3 = await page.locator('#colors').textContent()
    expect(colors3.includes('Yellow')).toBeTruthy;
    
    await page.waitForTimeout(3000)
})

test.only('Dropdown Autosuggest', async({page})=>{
    await page.goto('https://www.redbus.in/')


  // Click into the "From" field
  const fromInput = page.getByRole('textbox', { name: 'From' }); // or combobox, depending on what inspector shows
  await fromInput.click();

  // Now fill the city
  await fromInput.fill('Delhi');

  // Optional: pick the auto-suggest option
//   await page.getByText('Delhi', { exact: false }).click();




    // await page.getByText('From', { exact: true }).fill('Delhi')
    // await page.locator('div.srcDest___aa6db3').fill('Delhi')

    // await page.waitForSelector('')

    await page.waitForTimeout(3000)
})