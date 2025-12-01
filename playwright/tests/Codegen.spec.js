import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');
  await page.getByRole('textbox', { name: 'Username' }).fill('Admin');
  await page.getByRole('textbox', { name: 'Username' }).press('Tab');
  await page.getByRole('textbox', { name: 'Password' }).fill('admin123');
  await page.getByRole('button', { name: 'Login' }).click();
  // await page.getByRole('listitem').filter({ hasText: 'neymar Anuththara' }).locator('i').click();
  // await page.getByRole('menuitem', { name: 'Logout' }).click();

  await page.locator("//span[text()='PIM']").click();
  
  await page.locator('//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]').click()
  await page.waitForTimeout(3000)
  const options = await page.$$("//div[@role='listbox']//span")
  for(let option of options){
    let jobTitle = await option.textContent();
    if(jobTitle.trim() === 'QA Engineer')
      await option.click();
      break;
    // console.log(jobTitle.trim());
  }

  // await page.waitForTimeout(10000)
  await page.close()
});