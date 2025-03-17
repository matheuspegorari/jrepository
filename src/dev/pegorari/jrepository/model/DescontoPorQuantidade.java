package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DescontoPorQuantidade extends AbstractSankhyaEntity<DescontoPorQuantidade> {
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private BigDecimal nuPromocao;
   private BigDecimal percDesc;
   private BigDecimal qtde;
   private String tipDesc;
   private String atNuVersao;
   private BigDecimal nuVersao;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuPromocao() {
        return nuPromocao;
   }

   public void setNuPromocao(BigDecimal nuPromocao) {
        this.nuPromocao = nuPromocao;
   }

   public BigDecimal getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(BigDecimal percDesc) {
        this.percDesc = percDesc;
   }

   public BigDecimal getQtde() {
        return qtde;
   }

   public void setQtde(BigDecimal qtde) {
        this.qtde = qtde;
   }

   public String getTipDesc() {
        return tipDesc;
   }

   public void setTipDesc(String tipDesc) {
        this.tipDesc = tipDesc;
   }

   public String getAtNuVersao() {
        return atNuVersao;
   }

   public void setAtNuVersao(String atNuVersao) {
        this.atNuVersao = atNuVersao;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        this.nuVersao = nuVersao;
   }

   @Override
   public String getTableName() {
        return "TGFDPQ";
   }

   @Override
   public String getEntityName() {
        return "DescontoPorQuantidade";
   }

   @Override
   public DescontoPorQuantidade fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuPromocao = vo.asBigDecimal("NUPROMOCAO");
        this.percDesc = vo.asBigDecimal("PERCDESC");
        this.qtde = vo.asBigDecimal("QTDE");
        this.tipDesc = vo.asString("TIPDESC");
        this.atNuVersao = vo.asString("ATUNUVERSAO");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        return this;
   }
}
