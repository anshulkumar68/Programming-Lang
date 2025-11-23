function vowels(){
    let str = "RadHe"
    str= str.toLowerCase();

    const vowels = 'aeiou';
    let count = 0;

    for(let char of str){
       if(vowels.includes(char))
        count++;
    }
    console.log(count);
}

// vowels();


function getUsernameFromEmail() {
  let email = 'anshul3071@gmail.com'; // Get the email from the user
  let username = "";

  // Loop through the email to extract characters until '@'
  for (let i = 0; i < email.length; i++) {
    if (email[i] === "@") {
      break; // Stop at '@'
    } else {
      username += email[i]; // Append characters to the username
    }
  }

  console.log("Username from the email is: " + username);
}

// getUsernameFromEmail();


// replace characters
const replaceEI = ()=>{
    let name = 'eanshulee';
    let username = '';

    for(let i=0; i<name.length; i++){
        if(name[i]==='e'){
            username += 'i'
        }
        else{
            username += name[i];
        }
    }
    console.log(username);
}
// replaceEI();remove

// toggle 
const toggle= ()=>{
    let string = 'Anshul Kumar';
    let result = '';

    for(let ch of string){
        if(ch===ch.toUpperCase())
            result += ch.toLowerCase();
        else    
            result += ch.toUpperCase();
    }
    console.log(result);
}

// toggle();

// remove duplicate
const duplicate = () =>{
    let string = "anshulankumar";
    let result = '';

    for(let i=0; i<string.length; i++){
        if(result.indexOf(string[i])===-1){
            result +=string[i];
        }
    }
    console.log(result);
}

duplicate();