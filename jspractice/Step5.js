let apiResponse = [
  { id: 1, name: "Anshul", role: "QA", active: true },
  { id: 2, name: "Tu", role: "Tester", active: false },
  { id: 3, name: "Gallan", role: "SDE", active: true },
  { id: 4, name: "Avi", role: "QA", active: false }
];


// ✅ 1. Print total users
console.log(`Total Users : ${apiResponse.length}`)

// / ✅ 2. Print all active users (filter)
let activeUsers = apiResponse.filter(user => user.active)
console.log(activeUsers)

// ✅ 3. Print only active user names (map)
let activeUsernames = activeUsers.map(user => user.name)
console.log(activeUsernames)

// ✅ 4. Count how many QA users are active
let count = activeUsers.filter(user => user.role === 'QA').length
console.log(count)

// ✅ 5. Check if all users are active
console.log(apiResponse.every(user => user.active))