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

// 1- Utilisation d'une boucle for...of pour afficher tous les prénoms des étudiants
console.log("Prénoms des étudiants :");
for (let etudiant of etudiants) {
    console.log(etudiant);
}

// 2- Passage de la première lettre de chaque prénom en majuscule
console.log("\nPrénoms des étudiants avec la première lettre en majuscule :");
for (let etudiant of etudiants) {
    let premierLettreMajuscule = etudiant.charAt(0).toUpperCase() + etudiant.slice(1);
    console.log(premierLettreMajuscule);
}
