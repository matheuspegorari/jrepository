package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabelaINSS extends AbstractSankhyaEntity<TabelaINSS> {
   private String tipTabela;
   private BigDecimal aliquota;
   private Timestamp competencia;
   private BigDecimal vlrDeducao;
   private BigDecimal vlrLimite;

   public String getTipTabela() {
        return tipTabela;
   }

   public void setTipTabela(String tipTabela) {
        markAsChanged("TIPTABELA", tipTabela);
        this.tipTabela = tipTabela;
   }

   public BigDecimal getAliquota() {
        return aliquota;
   }

   public void setAliquota(BigDecimal aliquota) {
        markAsChanged("ALIQUOTA", aliquota);
        this.aliquota = aliquota;
   }

   public Timestamp getCompetencia() {
        return competencia;
   }

   public void setCompetencia(Timestamp competencia) {
        markAsChanged("COMPETENCIA", competencia);
        this.competencia = competencia;
   }

   public BigDecimal getVlrDeducao() {
        return vlrDeducao;
   }

   public void setVlrDeducao(BigDecimal vlrDeducao) {
        markAsChanged("VLRDEDUCAO", vlrDeducao);
        this.vlrDeducao = vlrDeducao;
   }

   public BigDecimal getVlrLimite() {
        return vlrLimite;
   }

   public void setVlrLimite(BigDecimal vlrLimite) {
        markAsChanged("VLRLIMITE", vlrLimite);
        this.vlrLimite = vlrLimite;
   }

   @Override
   public String getTableName() {
        return "TGFFAI";
   }

   @Override
   public String getEntityName() {
        return "TabelaINSS";
   }

   @Override
   public TabelaINSS fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.tipTabela = vo.asString("TIPTABELA");
        this.aliquota = vo.asBigDecimal("ALIQUOTA");
        this.competencia = vo.asTimestamp("COMPETENCIA");
        this.vlrDeducao = vo.asBigDecimal("VLRDEDUCAO");
        this.vlrLimite = vo.asBigDecimal("VLRLIMITE");
        return this;
   }
}
