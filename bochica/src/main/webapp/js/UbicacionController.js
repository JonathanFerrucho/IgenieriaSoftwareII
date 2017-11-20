'use strict';

module.controller('UbicacionCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = [];
        $scope.datosFormulario = {};
        $scope.panelEditar = false;
        $scope.listar = function () {
            $http.get('./webresources/Ubicacion', {})
                    .success(function (data, status, headers, config) {
                        $scope.lista = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };

        $scope.listarEnfermedad = function () {
            $http.get('./webresources/Enfermedad', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaEnfermedad = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de enfermedad, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarEnfermedad();
        $scope.listarPersona = function () {
            $http.get('./webresources/Persona', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaPersona = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de persona, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarPersona();
        $scope.listarDosisAplicada = function () {
            $http.get('./webresources/DosisAplicada', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaDosisAplicada = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de dosisAplicada, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarDosisAplicada();


        $scope.listar();
        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            $scope.datosFormulario = {};
        };

        $scope.guardar = function () {
            $scope.errores = {};
            var error = false;

            if (error)
                return;
            $http.post('./webresources/Ubicacion', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };
        $scope.cancelar = function () {
            $scope.panelEditar = false;
            $scope.datosFormulario = {};
        };

        //editar
        $scope.editar = function (data) {
            $scope.panelEditar = true;
            $scope.datosFormulario = data;
        };
        //eliminar
        $scope.eliminar = function (data) {
            if (confirm('\xbfDesea elminar este registro?')) {
                $http.delete('./webresources/Ubicacion/' + data.id, {})
                        .success(function (data, status, headers, config) {
                            $scope.listar();
                        }).error(function (data, status, headers, config) {
                    alert('Error al eliminar la informaci\xf3n de Ubicacion, por favor intente m\xe1s tarde');
                });
            }
        };
    }]);
