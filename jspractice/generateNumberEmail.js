// generate a mobile number

function generateNumber(){
    let contact ='';
    // for(let num of)
    let random = Math.floor(100000000 + (Math.random()*900000000));
    // contact+=random;
    console.log(`07${random}`)
} 
// generateNumber();

// generate email
function generateEmail(){
    let email ='';
    let obj = {1 : 'a', 2: 'b', 3:'c', 4:'d', 5:'e', 6:'f', 7:'g', 8:'h', 9 : 'i', 10 : 'j'}
    for(let i=0; i<4; i++){
        // let charCode = Math.ceil(Math.random()*10);
        // email+=obj[charCode]; 

        //
        let charCode = Math.floor(Math.random()*26)+97;
        email += String.fromCharCode(charCode);
    }
    console.log(`${email}@org.com`)
}
generateEmail();




