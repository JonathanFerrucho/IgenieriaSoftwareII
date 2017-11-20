'use strict';


// Declare app level module which depends on filters, and services
var app = angular.module('adminBochica', [
    'ngRoute',
    'angularUtils.directives.dirPagination',
    'adminBochica.controllers'
]);
app.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: 'partials/menu.html'});
        $routeProvider.when('/Historial', {templateUrl: 'partials/Historial.html', controller: 'HistorialCtrl'});
        $routeProvider.when('/Vacuna', {templateUrl: 'partials/Vacuna.html', controller: 'VacunaCtrl'});
        $routeProvider.when('/DosisAplicada', {templateUrl: 'partials/DosisAplicada.html', controller: 'DosisAplicadaCtrl'});
        $routeProvider.when('/Ubicacion', {templateUrl: 'partials/Ubicacion.html', controller: 'UbicacionCtrl'});
        $routeProvider.when('/Persona', {templateUrl: 'partials/Persona.html', controller: 'PersonaCtrl'});
        $routeProvider.when('/Enfermedad', {templateUrl: 'partials/Enfermedad.html', controller: 'EnfermedadCtrl'});
        $routeProvider.when('/Dosis', {templateUrl: 'partials/Dosis.html', controller: 'DosisCtrl'});

        $routeProvider.otherwise({redirectTo: '/'});
    }]);

var module = angular.module("adminBochica.controllers", []);
