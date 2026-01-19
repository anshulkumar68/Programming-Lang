// Making a request and get the response where country is India
import {test, expect} from '@playwright/test';

test('From API get response where country is india', async({request})=>{
    const response = await request.get('https://www.exampleapi.com', {
        headers:{
            Authorization : 'Bearer bearer_token'
        },
        params : {
            country : 'India'
        }
    });
    expect(response.status()).toBe(200);
    const body = await response.json();
    expect(body.country).toContain('India')
});

// using api create a user and use it later in UI testing
test('create user using API', async({page, request})=>{
    const response = await request.post('https://www.exampleapi.com/users', {
        headers : {
            Authorization : 'Bearer bearer_token'
        },
        data : {
            username : 'user1',
            password : 'test@123'
        }
    });
    expect(response.status()).toBe(200);
    const body = await response.json();
    const user = body.username;

    await page.goto('https://www.exampleapp.com/login');
    await page.locator('.username').fill(user);
})

//chain api first to create a username and then
test('simple API chaining example', async ({ request }) => {

  // 1️⃣ Create user
  const createResponse = await request.post(
    'https://www.exampleapi.com/users',
    {
      headers: {
        Authorization: 'Bearer bearer_token'
      },
      data: {
        username: 'test_user',
        password: 'test@123'
      }
    }
  );
  expect(createResponse.status()).toBe(200);
  const response = await createResponse.json();
  const userId = response.id;

  const getResponse = await request.get('https://www.exampleapi.com/users/${userId}', {
    headers: {
        Authorization: 'Bearer bearer_token'
      }
  });
  expect(getResponse.status()).toBe(200);

  const getBody = await getResponse.json();
  expect(getBody.id).toBe(userId);
});

