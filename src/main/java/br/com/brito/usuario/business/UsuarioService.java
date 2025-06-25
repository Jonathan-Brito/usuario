package br.com.brito.usuario.business;

import br.com.brito.usuario.business.converter.UsuarioConverter;
import br.com.brito.usuario.business.dto.UsuarioDTO;
import br.com.brito.usuario.infrastructure.entity.Usuario;
import br.com.brito.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;


    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(
                usuarioRepository.save(usuario)
        );
    }

}
