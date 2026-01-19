//     	   1          
//       1 2 3        
//     1 2 3 4 5      
//   1 2 3 4 5 6 7    

function pyramid3(num){
    for(let i=1; i<=num; i++) {
        let row="";
        //space
        for(let s=1; s<=num-i;s++){
             row += "  ";
        }
        //numbers
        for(let n=1; n<=2*i-1; n++){
            row += n + " ";
        }
        console.log(row) 
    }
}
pyramid3(4)


//       1
//     3 5 7
//   9 11 13 15 17
// 19 21 23 25 27 29 31

function pyramid(n){
    let oddNum=1;
    for(let i=1; i<=n; i++){
        let row = "";
        //space
        for(let s=1; s<=n-i; s++){
            row += "  ";
        }
        //number
        for(let l=1; l<=2*i-1; l++){
            row += oddNum + " ";
            oddNum += 2;
        }
        console.log(row)
    }
}
// pyramid(4)

//       1 
//     2 1 2 
//   3 2 1 2 3
// 4 3 2 1 2 3 4

function pyramid2(n){
    for(let i=1; i<=n; i++){
        let row = "";
        //space
        for(let s=1; s<=n-i; s++){
            row += "  ";
        }
        // //decerasing numbers
        for(let k=i; k>=1; k--){
            row += k+" ";
        }
        //increasing numbers
        for(let l=2; l<=i; l++){
            row += l + " ";
        }
        console.log(row)
    }
}
// pyramid2(4)