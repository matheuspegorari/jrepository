package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DescontoFinanceiroAplicado extends AbstractSankhyaEntity<DescontoFinanceiroAplicado> {
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
        markAsChanged("CODDESC", codDesc);
        this.codDesc = codDesc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getDifContratAplicad() {
        return difContratAplicad;
   }

   public void setDifContratAplicad(BigDecimal difContratAplicad) {
        markAsChanged("DIFCONTRATPLICAD", difContratAplicad);
        this.difContratAplicad = difContratAplicad;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
        this.nuFin = nuFin;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
        this.vlrDesc = vlrDesc;
   }

   public BigDecimal getVlrDescContratado() {
        return vlrDescContratado;
   }

   public void setVlrDescContratado(BigDecimal vlrDescContratado) {
        markAsChanged("VLRDESCCONTRATADO", vlrDescContratado);
        this.vlrDescContratado = vlrDescContratado;
   }

   @Override
   public String getTableName() {
        return "TGFDFA";
   }

   @Override
   public String getEntityName() {
        return "DescontoFinanceiroAplicado";
   }

   @Override
   public DescontoFinanceiroAplicado fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codDesc = vo.asBigDecimal("CODDESC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.difContratAplicad = vo.asBigDecimal("DIFCONTRATPLICAD");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.observacao = vo.asString("OBSERVACAO");
        this.vlrDesc = vo.asBigDecimal("VLRDESC");
        this.vlrDescContratado = vo.asBigDecimal("VLRDESCCONTRATADO");
        return this;
   }
}
