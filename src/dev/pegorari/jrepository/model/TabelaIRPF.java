package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabelaIRPF implements SankhyaEntity<TabelaIRPF> {

   private String tipTabela;
   private BigDecimal aliquota;
   private Timestamp competencia;
   private BigDecimal vlrDeducao;
   private BigDecimal vlrLimite;

   public String getTipTabela() {
        return tipTabela;
   }

   public void setTipTabela(String tipTabela) {
        this.tipTabela = tipTabela;
   }

   public BigDecimal getAliquota() {
        return aliquota;
   }

   public void setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
   }

   public Timestamp getCompetencia() {
        return competencia;
   }

   public void setCompetencia(Timestamp competencia) {
        this.competencia = competencia;
   }

   public BigDecimal getVlrDeducao() {
        return vlrDeducao;
   }

   public void setVlrDeducao(BigDecimal vlrDeducao) {
        this.vlrDeducao = vlrDeducao;
   }

   public BigDecimal getVlrLimite() {
        return vlrLimite;
   }

   public void setVlrLimite(BigDecimal vlrLimite) {
        this.vlrLimite = vlrLimite;
   }

   @Override
   public String getEntityName() {
        return "TabelaIRPF";
   }

   @Override
   public TabelaIRPF fromVO(DynamicVO vo) {
        this.tipTabela = vo.asString("TIPTABELA");
        this.aliquota = vo.asBigDecimal("ALIQUOTA");
        this.competencia = vo.asTimestamp("COMPETENCIA");
        this.vlrDeducao = vo.asBigDecimal("VLRDEDUCAO");
        this.vlrLimite = vo.asBigDecimal("VLRLIMITE");
        return this;
   }
}
