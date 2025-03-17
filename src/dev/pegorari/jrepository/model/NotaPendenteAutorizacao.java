package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaPendenteAutorizacao extends AbstractSankhyaEntity<NotaPendenteAutorizacao> {
   private String tipo;
   private Timestamp dhUltTenta;
   private BigDecimal qtdenvio;
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

   public BigDecimal getQtdenvio() {
        return qtdenvio;
   }

   public void setQtdenvio(BigDecimal qtdenvio) {
        this.qtdenvio = qtdenvio;
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
   public String getTableName() {
        return "TGFNPA";
   }

   @Override
   public String getEntityName() {
        return "NotaPendenteAutorizacao";
   }

   @Override
   public NotaPendenteAutorizacao fromVO(DynamicVO vo) {
        this.tipo = vo.asString("TIPO");
        this.dhUltTenta = vo.asTimestamp("DHULTTENTA");
        this.qtdenvio = vo.asBigDecimal("QTDENVIO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.dhInclusao = vo.asTimestamp("DHINCLUSAO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.compensar = vo.asString("COMPENSAR");
        return this;
   }
}
