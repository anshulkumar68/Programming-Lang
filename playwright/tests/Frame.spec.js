import{test, expect} from '@playwright/test'

test.skip('Frame', async({page})=>{
    await page.goto('https://ui.vision/demo/webtest/frames/')

    const allFrames = await page.frames()
    console.log(`Total number of frames :${allFrames.length}`)

    //Get frame using name or url attribute
    const frame = page.frame({url : 'https://ui.vision/demo/webtest/frames/frame_1.html'})
    await frame.locator('input[name="mytext1"]').fill('Hey! there')

    //  Locate element inside frame
    const frame2 = page.frameLocator('frame[src="frame_1.html"]').locator('input[name="mytext1"]')
    frame2.fill('Hey! again there')

    await page.waitForTimeout(3000)
    await page.close()
})


test('Nested iFrame', async({page})=>{
    await page.goto('https://ui.vision/demo/webtest/frames/')

    const allFrames = page.frames()
    console.log(`Total number of frames :${allFrames.length}`)

    //Get frame using name or url attribute
    const frame3 = page.frame({url : "https://ui.vision/demo/webtest/frames/frame_3.html"})

    // childframe
    const childFrame = frame3.childFrames();
    await childFrame[0].locator('#i9 > div.vd3tt > div').check()

    await page.waitForTimeout(3000)
    await page.close()
})