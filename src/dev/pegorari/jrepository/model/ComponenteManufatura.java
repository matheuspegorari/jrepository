package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ComponenteManufatura implements SankhyaEntity<ComponenteManufatura> {

   private String descricao;
   private BigDecimal grau;
   private BigDecimal qtdComp;
   private String analitico;
   private String ativo;
   private BigDecimal codCpm;
   private BigDecimal codCpmPai;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   public BigDecimal getQtdComp() {
        return qtdComp;
   }

   public void setQtdComp(BigDecimal qtdComp) {
        this.qtdComp = qtdComp;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodCpm() {
        return codCpm;
   }

   public void setCodCpm(BigDecimal codCpm) {
        this.codCpm = codCpm;
   }

   public BigDecimal getCodCpmPai() {
        return codCpmPai;
   }

   public void setCodCpmPai(BigDecimal codCpmPai) {
        this.codCpmPai = codCpmPai;
   }

   @Override
   public String getEntityName() {
        return "ComponenteManufatura";
   }

   @Override
   public ComponenteManufatura fromVO(DynamicVO vo) {
        this.descricao = vo.asString("DESCRICAO");
        this.grau = vo.asBigDecimal("GRAU");
        this.qtdComp = vo.asBigDecimal("QTDCOMP");
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.codCpm = vo.asBigDecimal("CODCPM");
        this.codCpmPai = vo.asBigDecimal("CODCPMPAI");
        return this;
   }
}
