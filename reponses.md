**Dépot git** : https://github.com/Celina-Hadjara/moda_TDD_octobre_2021_HADJARA.git


**Quelle duplication existe pour l’instant dans notre code ?**
Les duplications sont : l'initialisation de variables de test


**Est-il possible de faire un test qui n’implique l’ajout que d’une seule de ces deux méthodes ?**
Non, ce n'est pas possible de faire un test qu'avec une seule de ces deux méthodes, parce que la méthode
addTranslation ajoute les mots à traduire sa traduction. Et la méthode getTranslation retourne la traduction
à traduire


**Que proposez-vous pour pouvoir gérer les traductions multiples ?**
On peut utiliser comme valeur de map une liste : `HashMap<String, List<String>>`


Que pourrait-on proposer comme implémentation pour résoudre ce problème? 


**Discuter des avantages et des inconvénients de la technique du TDD par rapport à vos techniques de
développement usuelles.**
En développement, les tests visent à vérifier que le produit codé fonctionne comme prévu selon des scénarios 
prédéfinis. Étant donné que le test est déjà en place, il nous dira immédiatement si on casse le moindre 
comportement, garantissant qu'on est toujours concentré sur la fonctionnalité à tester en priorité.
Donc, avec le TDD le code est plus facile à teste ainsi de détecter les erreurs au plus tot ce qui ne permettra de
corriger le plus vite.