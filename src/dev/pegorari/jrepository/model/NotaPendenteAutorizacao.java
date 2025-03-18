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
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public Timestamp getDhUltTenta() {
        return dhUltTenta;
   }

   public void setDhUltTenta(Timestamp dhUltTenta) {
        markAsChanged("DHULTTENTA", dhUltTenta);
        this.dhUltTenta = dhUltTenta;
   }

   public BigDecimal getQtdenvio() {
        return qtdenvio;
   }

   public void setQtdenvio(BigDecimal qtdenvio) {
        markAsChanged("QTDENVIO", qtdenvio);
        this.qtdenvio = qtdenvio;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public Timestamp getDhInclusao() {
        return dhInclusao;
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        markAsChanged("DHINCLUSAO", dhInclusao);
        this.dhInclusao = dhInclusao;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public String getCompensar() {
        return compensar;
   }

   public void setCompensar(String compensar) {
        markAsChanged("COMPENSAR", compensar);
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
        this.setOriginalVO(vo);
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
