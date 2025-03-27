package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EntidadesRecentesFavoritas extends AbstractSankhyaEntity<EntidadesRecentesFavoritas> {
   public String getNomeInstancia() {
        return this.getVo().asString("NOMEINSTANCIA");
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
   }

   public Timestamp getDhUltimoAcesso() {
        return this.getVo().asTimestamp("DHULTIMOACESSO");
   }

   public void setDhUltimoAcesso(Timestamp dhUltimoAcesso) {
        markAsChanged("DHULTIMOACESSO", dhUltimoAcesso);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getFavorito() {
        return this.getVo().asString("FAVORITO");
   }

   public void setFavorito(String favorito) {
        markAsChanged("FAVORITO", favorito);
   }

   public String getPkRegistro() {
        return this.getVo().asString("PKREGISTRO");
   }

   public void setPkRegistro(String pkRegistro) {
        markAsChanged("PKREGISTRO", pkRegistro);
   }

   @Override
   public String getTableName() {
        return "TSIERF";
   }

   @Override
   public String getEntityName() {
        return "EntidadesRecentesFavoritas";
   }

   @Override
   public EntidadesRecentesFavoritas fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
