package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaPendenteAutorizacao implements SankhyaEntity<NotaPendenteAutorizacao> {

   private String tipo;
   private Timestamp dhUltTenta;
   private BigDecimal qtdeEnvio;
   private BigDecimal nuNota;
   private Timestamp dhInclusao;
   private BigDecimal codUsu;
   private BigDecimal codParc;
   private String compensar;

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public Timestamp getDhUltTenta() {
        return dhUltTenta;
   }

   public void setDhUltTenta(Timestamp dhUltTenta) {
        this.dhUltTenta = dhUltTenta;
   }

   public BigDecimal getQtdeEnvio() {
        return qtdeEnvio;
   }

   public void setQtdeEnvio(BigDecimal qtdeEnvio) {
        this.qtdeEnvio = qtdeEnvio;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public Timestamp getDhInclusao() {
        return dhInclusao;
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        this.dhInclusao = dhInclusao;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public String getCompensar() {
        return compensar;
   }

   public void setCompensar(String compensar) {
        this.compensar = compensar;
   }

   @Override
   public String getEntityName() {
        return "NotaPendenteAutorizacao";
   }

   @Override
   public NotaPendenteAutorizacao fromVO(DynamicVO vo) {
        this.tipo = vo.asString("TIPO");
        this.dhUltTenta = vo.asTimestamp("DHULTTENTA");
        this.qtdeEnvio = vo.asBigDecimal("QTDEENVIO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.dhInclusao = vo.asTimestamp("DHINCLUSAO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.compensar = vo.asString("COMPENSAR");
        return this;
   }
}
