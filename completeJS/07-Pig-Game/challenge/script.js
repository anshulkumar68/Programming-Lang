'use strict';

//Selecting elements
const player0El = document.querySelector('.player--0');
const player1El = document.querySelector('.player--1');
const current0El = document.querySelector('#current--0');
const current1El = document.querySelector('#current--1');
const score0El = document.querySelector('#score--0');
const score1El = document.querySelector('#score--1');
// selecting elements for dice
const diceEl = document.querySelector('.dice');
const btnRoll = document.querySelector('.btn--roll');
// for hold
const btnHold = document.querySelector('.btn--hold');
// for new game button
const btnNew = document.querySelector('.btn--new');

//Starting conditions
let scores, currentScore, activePlayer, playing;

const initial = function () {
  scores = [0, 0];
  currentScore = 0; // to set currentscore to 0
  activePlayer = 0; // to keep track of active player in game
  playing = 1;
  score0El.textContent = 0;
  score1El.textContent = 0;
  current0El.textContent = 0;
  current1El.textContent = 0;
  diceEl.classList.add('hidden');
  player0El.classList.remove('player--winner');
  player1El.classList.remove('player--winner');
  player0El.classList.add('player--active');
  player1El.classList.remove('player--active');
};
initial();

const switchPlayer = function () {
  document.getElementById(`current--${activePlayer}`).textContent = 0; // set current score of activePlayer to 0 before switching
  currentScore = 0;
  activePlayer = activePlayer === 0 ? 1 : 0;
  player0El.classList.toggle('player--active');
  player1El.classList.toggle('player--active');
};

// DICE ROLL
btnRoll.addEventListener('click', function () {
  if (playing === 1) {
    //1. Generate number
    const diceNumber = Math.trunc(Math.random() * 6 + 1);

    //2.Display dice
    diceEl.classList.remove('hidden');
    diceEl.src = `dice-${diceNumber}.png`;

    //3. Check for rolled 1 : if true, seitch to next player
    if (diceNumber !== 1) {
      currentScore += diceNumber;
      document.getElementById(`current--${activePlayer}`).textContent =
        currentScore;
    } else {
      switchPlayer();
    }
  }
});

// HOLDING SCORES
btnHold.addEventListener('click', function () {
  if (playing === 1) {
    // 1. Add current score to active player score's
    scores[activePlayer] += currentScore;
    document.getElementById(`score--${activePlayer}`).textContent =
      scores[activePlayer]; // display total score of current player
    // 2. check whether score is >100 or not
    if (scores[activePlayer] >= 100) {
      playing = 0;
      document
        .querySelector(`.player--${activePlayer}`)
        .classList.add('player--winner');
      // document
      //   .querySelector(`.player--${activePlayer}`)
      //   .classList.remove('player--active');
      diceEl.classList.add('hidden');
    } else {
      // 3. switchPlayer
      switchPlayer();
    }
  }
});

// RESETTING THE GAME
btnNew.addEventListener('click', initial);
