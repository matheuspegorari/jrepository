package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabelaIRPF extends AbstractSankhyaEntity<TabelaIRPF> {
   public String getTipTabela() {
        return this.getVo().asString("TIPTABELA");
   }

   public void setTipTabela(String tipTabela) {
        markAsChanged("TIPTABELA", tipTabela);
   }

   public BigDecimal getAliquota() {
        return this.getVo().asBigDecimal("ALIQUOTA");
   }

   public void setAliquota(BigDecimal aliquota) {
        markAsChanged("ALIQUOTA", aliquota);
   }

   public Timestamp getCompetencia() {
        return this.getVo().asTimestamp("COMPETENCIA");
   }

   public void setCompetencia(Timestamp competencia) {
        markAsChanged("COMPETENCIA", competencia);
   }

   public BigDecimal getVlrDeducao() {
        return this.getVo().asBigDecimal("VLRDEDUCAO");
   }

   public void setVlrDeducao(BigDecimal vlrDeducao) {
        markAsChanged("VLRDEDUCAO", vlrDeducao);
   }

   public BigDecimal getVlrLimite() {
        return this.getVo().asBigDecimal("VLRLIMITE");
   }

   public void setVlrLimite(BigDecimal vlrLimite) {
        markAsChanged("VLRLIMITE", vlrLimite);
   }

   @Override
   public String getTableName() {
        return "TGFFAI";
   }

   @Override
   public String getEntityName() {
        return "TabelaIRPF";
   }

   @Override
   public TabelaIRPF fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
