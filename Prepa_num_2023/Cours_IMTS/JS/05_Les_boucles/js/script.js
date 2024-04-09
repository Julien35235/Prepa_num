/**
 * Les boucles
 * Les boucles for(i) :
 * for (...of...)
 */

/*
let i=0;
i=i+1
i+=1;
i++;*/

// une boucle qui compte de 0 à 10
for(let i=0; i<=10; i++){
    console.log(i)
}
//console.log(i); // ne marche pas : la variable i n'est accesible que dans la boucle.
// ça s'appelle la porté de la variable ou en anglais "scop"
/*
// Contrairement au variable crées avec var
for(var i=0; i<10; i++){
    console.log(i);
}
console.log('en dehoers de la boucle '+i);
*/
let monTableau=['rouge','vert', 'jaune','bleu', 5];
for(let i=0; i<monTableau.length; i++){
    console.log(monTableau[i]);
}

// for ..of..
for (let element of monTableau){
    console.log(element);
}

/**
 * Exercice :
 * soit un tableau etudiants[]
 * let etudiants=['adrien', 'hermine', 'kevin', 'antoine','maxime'];
 * 1- Utilisez un boucle for of pour afficher tous les prénoms des étudiants 
 * dans la console
 * 2 passez la première lettre de chaque prénom en masjuscule 
 * et affichez le prénom avec la majuscule dans la console 
 * */

let etudiants = ['adrien', 'hermine', 'kevin', 'antoine', 'maxime'];

// 1. Utilisez une boucle for...of pour afficher tous les prénoms des étudiants dans la console
console.log("Prénoms des étudiants :");
for (let etudiant of etudiants) {
    console.log(etudiant);
}

// 2. Passez la première lettre de chaque prénom en majuscule et affichez le prénom avec la majuscule dans la console
/** *
console.log("\nPrénoms avec la première lettre en majuscule :");
for (let etudiant of etudiants) {
    let prenomMajuscule = etudiant.charAt(0).toUpperCase() + etudiant.substring(1);
    console.log(prenomMajuscule);
}
*/

// Corrigé
/**
 * 
for (let etudiant of etudiants){
    console.log(etudiant);
    console.log(etudiant.charAt(0).toLocaleUpperCase.etudiant.substring(1));
} */

// for i
/**
 * 
for(let i=0; i<= etudiants.length; i++){
    console.log[i];
    console.log(etudiants[i].charAt(0).toLocaleUpperCase()+etudiants[i].substring(1));
    console.log(etudiants[i].charAt(0).toLocaleUpperCase()+etudiants[i].substring(1));
}
 */
for(let i=0; i>= etudiants.length; i--){
    console.log[i];
}



