package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EntidadesRecentesFavoritas extends AbstractSankhyaEntity<EntidadesRecentesFavoritas> {
   private String nomeInstancia;
   private Timestamp dhUltimoAcesso;
   private BigDecimal codUsu;
   private String favorito;
   private String pkRegistro;

   public String getNomeInstancia() {
        return nomeInstancia;
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
        this.nomeInstancia = nomeInstancia;
   }

   public Timestamp getDhUltimoAcesso() {
        return dhUltimoAcesso;
   }

   public void setDhUltimoAcesso(Timestamp dhUltimoAcesso) {
        markAsChanged("DHULTIMOACESSO", dhUltimoAcesso);
        this.dhUltimoAcesso = dhUltimoAcesso;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getFavorito() {
        return favorito;
   }

   public void setFavorito(String favorito) {
        markAsChanged("FAVORITO", favorito);
        this.favorito = favorito;
   }

   public String getPkRegistro() {
        return pkRegistro;
   }

   public void setPkRegistro(String pkRegistro) {
        markAsChanged("PKREGISTRO", pkRegistro);
        this.pkRegistro = pkRegistro;
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
        this.nomeInstancia = vo.asString("NOMEINSTANCIA");
        this.dhUltimoAcesso = vo.asTimestamp("DHULTIMOACESSO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.favorito = vo.asString("FAVORITO");
        this.pkRegistro = vo.asString("PKREGISTRO");
        return this;
   }
}
