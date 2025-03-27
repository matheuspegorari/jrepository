package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DescontoFinanceiroAplicado extends AbstractSankhyaEntity<DescontoFinanceiroAplicado> {
   public BigDecimal getCodDesc() {
        return this.getVo().asBigDecimal("CODDESC");
   }

   public void setCodDesc(BigDecimal codDesc) {
        markAsChanged("CODDESC", codDesc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getDifContratAplicad() {
        return this.getVo().asBigDecimal("DIFCONTRATPLICAD");
   }

   public void setDifContratAplicad(BigDecimal difContratAplicad) {
        markAsChanged("DIFCONTRATPLICAD", difContratAplicad);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getVlrDesc() {
        return this.getVo().asBigDecimal("VLRDESC");
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
   }

   public BigDecimal getVlrDescContratado() {
        return this.getVo().asBigDecimal("VLRDESCCONTRATADO");
   }

   public void setVlrDescContratado(BigDecimal vlrDescContratado) {
        markAsChanged("VLRDESCCONTRATADO", vlrDescContratado);
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
        return this;
   }
}
