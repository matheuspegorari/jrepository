package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CargosEtapasProcesso extends AbstractSankhyaEntity<CargosEtapasProcesso> {
   public BigDecimal getCodEtapa() {
        return this.getVo().asBigDecimal("CODETAPA");
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
   }

   public BigDecimal getSeqEtapa() {
        return this.getVo().asBigDecimal("SEQETAPA");
   }

   public void setSeqEtapa(BigDecimal seqEtapa) {
        markAsChanged("SEQETAPA", seqEtapa);
   }

   public BigDecimal getCodCargo() {
        return this.getVo().asBigDecimal("CODCARGO");
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getPeso() {
        return this.getVo().asBigDecimal("PESO");
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getPontuacaoMinima() {
        return this.getVo().asBigDecimal("PONTUACAOMINIMA");
   }

   public void setPontuacaoMinima(BigDecimal pontuacaoMinima) {
        markAsChanged("PONTUACAOMINIMA", pontuacaoMinima);
   }

   public BigDecimal getVlrEtapa() {
        return this.getVo().asBigDecimal("VLRETAPA");
   }

   public void setVlrEtapa(BigDecimal vlrEtapa) {
        markAsChanged("VLRETAPA", vlrEtapa);
   }

   @Override
   public String getTableName() {
        return "TRSECG";
   }

   @Override
   public String getEntityName() {
        return "CargosEtapasProcesso";
   }

   @Override
   public CargosEtapasProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
