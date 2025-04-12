# quizArquitectura

### 1. ✅ Mostrar las reservas de la zona social con propietario

**URL:**  
`GET http://localhost:8080/api/reservas-zona-social-con-propietario`

**Descripción:**  
Lista todas las reservas de zona social con la información del propietario que la realizó.

**Parámetros:**  
Ninguno.

**Respuesta esperada (JSON):**

```json
[
  {
    "id_reserva": 1,
    "fecha": "2023-01-02",
    "hora_inicio": "08:00:00",
    "zonaSocial": {
      "id_zona": 1,
      "nombre": "Salón comunal",
      "ubicacion": "Calle 123 #45-67",
      "capacidad": 80
    },
    "propietario": {
      "id_propietario": 1,
      "nombre": "Leonel Colomer Gracia",
      "cedula": "9640034815"
    }
  }
]
```


### 2. ✅ listar los propietarios con los visitantes que ha tenido

**URL:**  
`GET http://localhost:8080/api/propietarios-con-visitantes`

**Descripción:**  
Devuelve una lista de propietarios con los visitantes registrados asociados a cada uno.

**Parámetros:**  
Ninguno.

**Respuesta esperada (JSON):**

```json
[
  {
    "id_propietario": 1,
    "nombre": "Leonel Colomer Gracia",
    "cedula": "9640034815",
    "visitantes": [
      {
        "id_visitante": 5,
        "nombre": "Carlos Herrera",
        "documento": "1234567890"
      }
    ]
  }
]
```


### 3. ✅ Listar las reservas de parqueadero por propietario

**URL:**  
`GET http://localhost:8080/api/propietario/{id}/reservas-parqueadero`

**Descripción:**  
Consulta todas las reservas de parqueadero hechas por un propietario específico.

**Parámetros:**  
**id** (requerido): ID del propietario (entero)

**Ejemplo De Uso**

`GET http://localhost:8080/api/propietario/1/reservas-parqueader`
**Respuesta esperada (JSON):**

```json
[
  {
    "id_reserva": 27,
    "fecha": "2024-09-12",
    "parqueadero": {
      "id_parqueadero": 1,
      "numero": "P01"
    }
  }
]
```
### 4. ✅ Listar reservas de la zona social por fecha

**URL:**  
`GET http://localhost:8080/api/reservas-zona-por-fecha?fecha=YYYY-MM-DD`

**Descripción:**  
Devuelve las reservas de zonas sociales que coinciden con una fecha específica.

**Parámetros:**  
**fecha** (requerido): Fecha en formato YYYY-MM-DD.

**Ejemplo De Uso**

`GET http://localhost:8080/api/reservas-zona-por-fecha?fecha=2023-03-11`

**Respuesta esperada (JSON):**

```json
[
  {
    "id_reserva": 80,
    "fecha": "2023-03-11",
    "hora_inicio": "11:00:00",
    "zonaSocial": {
      "id_zona": 10,
      "nombre": "Sauna",
      "ubicacion": "Calle 132 #52-72",
      "capacidad": 12
    }
  }
]
```
