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
});

test('Get users API', async ({ request }) => {
  const response = await request.get('https://www.google.com', {
    headers: {
      Authorization: 'Bearer token'
    },
    params : {
        country : 'India'
    }
  });

  expect(response.status()).toBe(200);

  const body = await response.json();
  expect(body.country).toBe('India');
});