package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ComponenteManufatura extends AbstractSankhyaEntity<ComponenteManufatura> {
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
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public BigDecimal getQtdComp() {
        return qtdComp;
   }

   public void setQtdComp(BigDecimal qtdComp) {
        markAsChanged("QTDCOMP", qtdComp);
        this.qtdComp = qtdComp;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodCpm() {
        return codCpm;
   }

   public void setCodCpm(BigDecimal codCpm) {
        markAsChanged("CODCPM", codCpm);
        this.codCpm = codCpm;
   }

   public BigDecimal getCodCpmPai() {
        return codCpmPai;
   }

   public void setCodCpmPai(BigDecimal codCpmPai) {
        markAsChanged("CODCPMPAI", codCpmPai);
        this.codCpmPai = codCpmPai;
   }

   @Override
   public String getTableName() {
        return "TPRCPM";
   }

   @Override
   public String getEntityName() {
        return "ComponenteManufatura";
   }

   @Override
   public ComponenteManufatura fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
