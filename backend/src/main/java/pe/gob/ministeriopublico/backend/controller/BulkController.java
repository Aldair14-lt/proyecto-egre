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

    // Fase 1: Catálogos Base
    @PostMapping("/distritos-fiscales")
    @Transactional
    public ResponseEntity<String> bulkDistritosFiscales(@RequestBody List<DistritoFiscal> lista) {
        distritoFiscalRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " distritos fiscales.");
    }

    @PostMapping("/clasificaciones")
    @Transactional
    public ResponseEntity<String> bulkClasificaciones(@RequestBody List<Clasificacion> lista) {
        clasificacionRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertadas " + lista.size() + " clasificaciones.");
    }

    @PostMapping("/marcas")
    @Transactional
    public ResponseEntity<String> bulkMarcas(@RequestBody List<Marca> lista) {
        marcaRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertadas " + lista.size() + " marcas.");
    }

    @PostMapping("/estados-equipo")
    @Transactional
    public ResponseEntity<String> bulkEstadosEquipo(@RequestBody List<EstadoEquipo> lista) {
        estadoEquipoRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " estados de equipo.");
    }

    @PostMapping("/tipos-mantenimiento")
    @Transactional
    public ResponseEntity<String> bulkTiposMantenimiento(@RequestBody List<TipoMatenimiento> lista) {
        tipoMatenimientoRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " tipos de mantenimiento.");
    }

    @PostMapping("/tipos-personal")
    @Transactional
    public ResponseEntity<String> bulkTiposPersonal(@RequestBody List<TipoPersonal> lista) {
        tipoPersonalRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " tipos de personal.");
    }

    @PostMapping("/roles")
    @Transactional
    public ResponseEntity<String> bulkRoles(@RequestBody List<Rol> lista) {
        rolRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " roles.");
    }

    // Fase 2: Estructura Organizacional y Modelos
    @PostMapping("/sedes")
    @Transactional
    public ResponseEntity<String> bulkSedes(@RequestBody List<Sede> lista) {
        sedeRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertadas " + lista.size() + " sedes.");
    }

    @PostMapping("/despachos")
    @Transactional
    public ResponseEntity<String> bulkDespachos(@RequestBody List<Despacho> lista) {
        despachoRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " despachos.");
    }

    @PostMapping("/modelos")
    @Transactional
    public ResponseEntity<String> bulkModelos(@RequestBody List<Modelo> lista) {
        modeloRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " modelos.");
    }

    // Fase 3: Personal y Usuarios
    @PostMapping("/personal")
    @Transactional
    public ResponseEntity<String> bulkPersonal(@RequestBody List<Personal> lista) {
        personalRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " registros de personal.");
    }

    @PostMapping("/usuarios")
    @Transactional
    public ResponseEntity<String> bulkUsuarios(@RequestBody List<Usuario> lista) {
        usuarioRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " usuarios.");
    }

    @PostMapping("/usuarios-roles")
    @Transactional
    public ResponseEntity<String> bulkUsuariosRoles(@RequestBody List<UsuarioRol> lista) {
        usuarioRolRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " asignaciones usuario-rol.");
    }

    // Fase 4: Equipos y Transacciones
    @PostMapping("/equipos")
    @Transactional
    public ResponseEntity<String> bulkEquipos(@RequestBody List<Equipo> lista) {
        equipoRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " equipos.");
    }

    @PostMapping("/asignaciones-equipo")
    @Transactional
    public ResponseEntity<String> bulkAsignacionesEquipo(@RequestBody List<AsignacionEquipo> lista) {
        asignacionEquipoRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertadas " + lista.size() + " asignaciones de equipo.");
    }

    @PostMapping("/mantenimientos")
    @Transactional
    public ResponseEntity<String> bulkMantenimientos(@RequestBody List<Mantenimiento> lista) {
        mantenimientoRepository.saveAll(lista);
        return ResponseEntity.status(HttpStatus.CREATED).body("Insertados " + lista.size() + " mantenimientos.");
    }
}