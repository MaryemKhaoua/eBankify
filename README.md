# Contexte du projet
## 1. Contexte du projet

​

L'objectif de ce projet est de développer une application de gestion bancaire en ligne avec une architecture RESTful modulaire utilisant Spring Boot, Spring Data JPA, Liquibase pour la gestion des migrations de base de données, JUnit pour les tests unitaires , ainsi qu'un système centralisé de gestion des exceptions pour garantir la fiabilité et la robustesse du système.

​

## 2. Objectifs du projet

​

Développer une API REST pour la gestion bancaire. Implémenter trois rôles utilisateurs (ADMIN, USER, EMPLOYEE), chacun avec des droits d'accès et des permissions bien définies. Gérer les exceptions de manière centralisée en renvoyant des messages d'erreurs structurés en JSON. Utiliser Liquibase pour gérer les versions de la base de données et assurer la migration. Rédiger des tests unitaires avec JUnit pour vérifier le bon fonctionnement des fonctionnalités critiques.

​

## 3. Périmètre Fonctionnel

​

#### 3.1. Rôles et permissions

​

# ADMIN :

​

Peut gérer les utilisateurs (création, modification, suppression).

Accès complet à l'application : gestion des comptes bancaires et des transactions.

Peut consulter, modifier, et supprimer n'importe quel compte bancaire.

​

# USER :

​

Peut créer ses propres comptes et effectuer des transactions.

Peut consulter l'historique de ses transactions. Ne peut pas voir ou modifier les comptes des autres utilisateurs.

​

# EMPLOYEE :

​

Peut consulter les comptes des clients et approuver ou rejeter certaines transactions importantes (par exemple, des virements de montants élevés).

Ne peut pas créer ni modifier les comptes des clients.

​

#### 3.2. Gestion des Utilisateurs

​

Les utilisateurs sont associés à un rôle (ADMIN, USER, EMPLOYEE) lors de leur création.

Chaque utilisateur peut se connecter à l'application et accéder aux fonctionnalités spécifiques à son rôle.

​

#### 3.3. Gestion des Comptes Bancaires

​

Les utilisateurs peuvent créer un ou plusieurs comptes bancaires.

Les utilisateurs peuvent consulter le solde de leurs comptes.

Les administrateurs peuvent bloquer ou activer un compte bancaire.

​

#### 3.4. Transactions

​

Un USER peut effectuer des virements entre ses comptes ou vers d'autres utilisateurs.

​

Les transactions peuvent être classées en plusieurs types :

​

Classiques : Transactions standard entre comptes.

​

Instantanées : Transactions traitées immédiatement.

​

Virements Permanents : Permettent à un utilisateur de programmer des virements à une fréquence définie (mensuelle, hebdomadaire, etc.) pour une durée spécifique.

​

Les transactions importantes doivent être approuvées par un EMPLOYEE.

​

Les utilisateurs et employés peuvent consulter l'historique des transactions.

La logique métier pour les transactions inclura la vérification des fonds disponibles et des limites de virement.

​

Taux de Transaction

​

Pour les virements vers une autre banque, des taux de transaction spécifiques seront appliqués :

​

Transactions Classiques : Un taux de transaction sera défini pour les virements classiques entre comptes de différentes banques.

​

Transactions Instantanées : Un taux de transaction distinct sera appliqué pour les virements instantanés vers d'autres banques, permettant ainsi de gérer les frais associés à la rapidité des transactions.

​

3.5. Factures et Prêts

​

Gestion des factures : permettre aux utilisateurs de consulter et de gérer leurs factures.

Gestion des prêts : permettre aux utilisateurs de faire des demandes de prêt, qui seront approuvées ou rejetées par les ADMIN ou EMPLOYEE selon des critères prédéfinis.

​

#### 3.5.1. Critères d'Éligibilité pour le Crédit

​

Pour qu'un utilisateur soit éligible à un crédit, il doit remplir les critères suivants :

​

Âge Minimum : L'utilisateur doit avoir au moins 18 ans.

Revenu Mensuel : L'utilisateur doit fournir une preuve de revenus mensuels stables (paye, déclaration d'impôts, etc.) d'un montant minimum (à définir).

Historique de Crédit : Un bon historique de crédit, vérifié par des agences de notation ou des rapports internes, est requis.

Ratio d'Endettement : Le ratio d'endettement de l'utilisateur (total des dettes par rapport aux revenus) ne doit pas dépasser un certain seuil (par exemple, 40%).

Garanties : L'utilisateur peut être tenu de fournir des garanties, comme un bien immobilier ou un autre actif, selon le montant du crédit demandé.

Durée de Relation Bancaire : L'utilisateur doit être client de la banque depuis un certain temps (par exemple, 6 mois) pour établir une relation de confiance.
