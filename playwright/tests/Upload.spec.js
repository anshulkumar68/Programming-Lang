import {test, expect} from '@playwright/test'

test('File Upload', async({page})=>{
    // await page.goto('https://davidwalsh.name/demo/multiple-file-upload.php')
    await page.goto('https://enhancv.com/resources/resume-checker/')

    // await page.locator("button[class='_7d9Ew3rdopoMTEUs4G1Anw== nh1o124RBbCY8z2D0sMLjg== nGpAi8-ak8xa9URpRfVrDQ== s6uaHA305IeoqI4xywTdvA== UploadResume_uploadBtn__qE6pI m-auto']").setInputFiles('tests\Resume1.pdf')
    await page.locator('input[type="file"]').first().setInputFiles('tests/Resume1.pdf');
    await page.waitForTimeout(3000)
    await page.close()
})

test.only('Multiple File Upload', async({page})=>{
    await page.goto('https://davidwalsh.name/demo/multiple-file-upload.php')

    await page.locator('#filesToUpload').setInputFiles(['tests/Resume1.pdf', 'tests/Resume2.pdf']);
    await expect(page.locator('#fileList li:nth-child(1)')).toHaveText('Resume1.pdf')
    await expect(page.locator('#fileList li:nth-child(2)')).toHaveText('Resume2.pdf')
    
    // Removing file upload
    await page.locator('#filesToUpload').setInputFiles([]);
    await expect(page.locator('#fileList li:nth-child(1)')).toHaveText('No Files Selected')

    await page.waitForTimeout(4000)
    await page.close()
})

