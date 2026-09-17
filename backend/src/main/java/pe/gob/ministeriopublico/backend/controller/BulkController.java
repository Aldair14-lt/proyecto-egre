package pe.gob.ministeriopublico.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import pe.gob.ministeriopublico.backend.entity.*;
import pe.gob.ministeriopublico.backend.repository.*;

import java.util.List;

@RestController
@RequestMapping("/api/bulk")
@CrossOrigin(origins = "*")
public class BulkController {

    private final AsignacionEquipoRepository asignacionEquipoRepository;
    private final ClasificacionRepository clasificacionRepository;
    private final DespachoRepository despachoRepository;
    private final DistritoFiscalRepository distritoFiscalRepository;
    private final EquipoRepository equipoRepository;
    private final EstadoEquipoRepository estadoEquipoRepository;
    private final MantenimientoRepository mantenimientoRepository;
    private final MarcaRepository marcaRepository;
    private final ModeloRepository modeloRepository;
    private final PersonalRepository personalRepository;
    private final RolRepository rolRepository;
    private final SedeRepository sedeRepository;
    private final TipoMatenimientoRepository tipoMatenimientoRepository;
    private final TipoPersonalRepository tipoPersonalRepository;
    private final UsuarioRepository usuarioRepository;
    private final UsuarioRolRepository usuarioRolRepository;

    public BulkController(AsignacionEquipoRepository asignacionEquipoRepository,
                          ClasificacionRepository clasificacionRepository,
                          DespachoRepository despachoRepository,
                          DistritoFiscalRepository distritoFiscalRepository,
                          EquipoRepository equipoRepository,
                          EstadoEquipoRepository estadoEquipoRepository,
                          MantenimientoRepository mantenimientoRepository,
                          MarcaRepository marcaRepository,
                          ModeloRepository modeloRepository,
                          PersonalRepository personalRepository,
                          RolRepository rolRepository,
                          SedeRepository sedeRepository,
                          TipoMatenimientoRepository tipoMatenimientoRepository,
                          TipoPersonalRepository tipoPersonalRepository,
                          UsuarioRepository usuarioRepository,
                          UsuarioRolRepository usuarioRolRepository) {
        this.asignacionEquipoRepository = asignacionEquipoRepository;
        this.clasificacionRepository = clasificacionRepository;
        this.despachoRepository = despachoRepository;
        this.distritoFiscalRepository = distritoFiscalRepository;
        this.equipoRepository = equipoRepository;
        this.estadoEquipoRepository = estadoEquipoRepository;
        this.mantenimientoRepository = mantenimientoRepository;
        this.marcaRepository = marcaRepository;
        this.modeloRepository = modeloRepository;
        this.personalRepository = personalRepository;
        this.rolRepository = rolRepository;
        this.sedeRepository = sedeRepository;
        this.tipoMatenimientoRepository = tipoMatenimientoRepository;
        this.tipoPersonalRepository = tipoPersonalRepository;
        this.usuarioRepository = usuarioRepository;
        this.usuarioRolRepository = usuarioRolRepository;
    }

    // 1. Catálogo Base
    @PostMapping("/distritos-fiscales")
@Transactional
public ResponseEntity<String> bulkDistritosFiscales(@RequestBody List<DistritoFiscal> lista) {
    distritoFiscalRepository.saveAll(lista);
    return ResponseEntity.status(HttpStatus.CREATED)
            .body("Carga masiva completada. Registros insertados: " + lista.size());
}

    @PostMapping("/clasificaciones")
    @Transactional
    public ResponseEntity<List<Clasificacion>> bulkClasificaciones(@RequestBody List<Clasificacion> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clasificacionRepository.saveAll(lista));
    }

    @PostMapping("/marcas")
    @Transactional
    public ResponseEntity<List<Marca>> bulkMarcas(@RequestBody List<Marca> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(marcaRepository.saveAll(lista));
    }

    @PostMapping("/estados-equipo")
    @Transactional
    public ResponseEntity<List<EstadoEquipo>> bulkEstadosEquipo(@RequestBody List<EstadoEquipo> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(estadoEquipoRepository.saveAll(lista));
    }

    @PostMapping("/tipos-mantenimiento")
    @Transactional
    public ResponseEntity<List<TipoMatenimiento>> bulkTiposMantenimiento(@RequestBody List<TipoMatenimiento> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoMatenimientoRepository.saveAll(lista));
    }

    @PostMapping("/tipos-personal")
    @Transactional
    public ResponseEntity<List<TipoPersonal>> bulkTiposPersonal(@RequestBody List<TipoPersonal> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoPersonalRepository.saveAll(lista));
    }

    @PostMapping("/roles")
    @Transactional
    public ResponseEntity<List<Rol>> bulkRoles(@RequestBody List<Rol> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(rolRepository.saveAll(lista));
    }

    // 2. Entidades Intermedias
    @PostMapping("/sedes")
    @Transactional
    public ResponseEntity<List<Sede>> bulkSedes(@RequestBody List<Sede> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(sedeRepository.saveAll(lista));
    }

    @PostMapping("/despachos")
    @Transactional
    public ResponseEntity<List<Despacho>> bulkDespachos(@RequestBody List<Despacho> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(despachoRepository.saveAll(lista));
    }

    @PostMapping("/modelos")
    @Transactional
    public ResponseEntity<List<Modelo>> bulkModelos(@RequestBody List<Modelo> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(modeloRepository.saveAll(lista));
    }

    @PostMapping("/personal")
    @Transactional
    public ResponseEntity<List<Personal>> bulkPersonal(@RequestBody List<Personal> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(personalRepository.saveAll(lista));
    }

    @PostMapping("/usuarios")
    @Transactional
    public ResponseEntity<List<Usuario>> bulkUsuarios(@RequestBody List<Usuario> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.saveAll(lista));
    }

    @PostMapping("/usuarios-roles")
    @Transactional
    public ResponseEntity<List<UsuarioRol>> bulkUsuariosRoles(@RequestBody List<UsuarioRol> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRolRepository.saveAll(lista));
    }

    // 3. Entidades Principales y Transaccionales
    @PostMapping("/equipos")
    @Transactional
    public ResponseEntity<List<Equipo>> bulkEquipos(@RequestBody List<Equipo> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(equipoRepository.saveAll(lista));
    }

    @PostMapping("/asignaciones-equipo")
    @Transactional
    public ResponseEntity<List<AsignacionEquipo>> bulkAsignacionesEquipo(@RequestBody List<AsignacionEquipo> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(asignacionEquipoRepository.saveAll(lista));
    }

    @PostMapping("/mantenimientos")
    @Transactional
    public ResponseEntity<List<Mantenimiento>> bulkMantenimientos(@RequestBody List<Mantenimiento> lista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(mantenimientoRepository.saveAll(lista));
    }
}