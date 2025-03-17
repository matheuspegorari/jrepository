package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DescontoFinanceiroAplicado implements SankhyaEntity<DescontoFinanceiroAplicado> {

   private BigDecimal codDesc;
   private BigDecimal codUsu;
   private BigDecimal difContratAplicad;
   private Timestamp dtAlter;
   private BigDecimal nuFin;
   private String observacao;
   private BigDecimal vlrDesc;
   private BigDecimal vlrDescContratado;

   public BigDecimal getCodDesc() {
        return codDesc;
   }

   public void setCodDesc(BigDecimal codDesc) {
        this.codDesc = codDesc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getDifContratAplicad() {
        return difContratAplicad;
   }

   public void setDifContratAplicad(BigDecimal difContratAplicad) {
        this.difContratAplicad = difContratAplicad;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        this.vlrDesc = vlrDesc;
   }

   public BigDecimal getVlrDescContratado() {
        return vlrDescContratado;
   }

   public void setVlrDescContratado(BigDecimal vlrDescContratado) {
        this.vlrDescContratado = vlrDescContratado;
   }

   @Override
   public String getEntityName() {
        return "DescontoFinanceiroAplicado";
   }

   @Override
   public DescontoFinanceiroAplicado fromVO(DynamicVO vo) {
        this.codDesc = vo.asBigDecimal("CODDESC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.difContratAplicad = vo.asBigDecimal("DIFCONTRATAPLICAD");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.observacao = vo.asString("OBSERVACAO");
        this.vlrDesc = vo.asBigDecimal("VLRDESC");
        this.vlrDescContratado = vo.asBigDecimal("VLRDESCCONTRATADO");
        return this;
   }
}
