'use strict';

const anshul = {
  firstName: 'anshul',
  lastName: 'yadav',
  fullName: function (lastName) {
    console.log(this.firstName + this.lastName);
  },
};

const roshni = {
  firstName: 'roshni',
  lastName: 'devi',
};
anshul.fullName();

roshni.fullName = anshul.fullName;
roshni.fullName();
