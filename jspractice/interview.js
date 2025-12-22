// Given an array of intervals [[s1,e1],[s2,e2],...], merge all overlapping intervals and return the merged list.
// input : [[1,3],[2,6],[8,10],[15,18]]
// // OUTPUT: [[1,6],[8,10],[15,18]]

function merge(){
    let arr = [[1,3],[2,6],[8,10],[15,18]];
    let res = [[]];
    let k=0, l= 0;
    for(let i=0; i<arr.length-1; i++){
        // console.log(arr1[i]);
        for(let j=0; j<arr[i].length; j++){
            // console.log(arr[i+1][j])
            if(arr[i][j+1]>arr[i+1][j]){
                res.push(arr[i+1][j+1])                
            }
        }
    }
        console.log(res)
}
merge();


/*
Using filter, map, reduce Question: Given an array of users, calculate total salary of active users
const users = [
  { name: "A", salary: 3000, active: true },
  { name: "B", salary: 4000, active: false },
  { name: "C", salary: 5000, active: true }
];

const totalSalary = users
  .filter(user => user.active)        // keep only active users
  .map(user => user.salary)           // extract salaries
  .reduce((sum, sal) => sum + sal, 0); // sum them

console.log(totalSalary); // 8000

*/

/*
Sample Nested JSON Response
 
{
  "status": "SUCCESS",
  "message": "Order details fetched successfully",
  "data": {
    "orderId": "ORD-20250101-1001",
    "orderDate": "2025-01-01T10:15:30Z",
    "customer": {
      "customerId": "CUST-78945",
      "name": "Ajay Singh",
      "email": "ajay.singh@email.com",
      "phone": "+91-9876543210",
      "address": {
        "line1": "Flat 402, Green Heights",
        "city": "Bangalore",
        "state": "Karnataka",
        "pincode": "560102"
      }
    },

    "items": [
      {
        "itemId": "ITEM-101",
        "name": "Wireless Mouse",
        "quantity": 2,
        "price": 799.50,
        "discount": 50,
        "category": "Electronics"
      },
      {
        "itemId": "ITEM-202",
        "name": "Mechanical Keyboard",
        "quantity": 1,
        "price": 3499.00,
        "discount": 0,
        "category": "Electronics"
      }
    ],

    "payment": {
      "paymentId": "PAY-556677",
      "method": "CREDIT_CARD",
      "status": "PAID",
      "transactionDate": "2025-01-01T10:16:00Z"
    },

    "summary": {
      "totalItems": 3,
      "subTotal": 5098.00,
      "totalDiscount": 100,
      "tax": 917.64,
      "grandTotal": 5915.64
    }
  }
}
*/
 /* 
Validate HTTP status code is 200 
Validate status is "SUCCESS"
Validate orderId is not null
Validate items array is not empty 
Validate total quantity equals summary.totalItems
Validate each item price is greater than 0
 */