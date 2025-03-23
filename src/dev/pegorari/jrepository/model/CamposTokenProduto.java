package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CamposTokenProduto extends AbstractSankhyaEntity<CamposTokenProduto> {
   private String campo;
   private BigDecimal codCfg;
   private String entidade;
   private BigDecimal relevancia;
   private String tabela;

   public String getCampo() {
        return campo;
   }

   public void setCampo(String campo) {
        markAsChanged("CAMPO", campo);
        this.campo = campo;
   }

   public BigDecimal getCodCfg() {
        return codCfg;
   }

   public void setCodCfg(BigDecimal codCfg) {
        markAsChanged("CODCFG", codCfg);
        this.codCfg = codCfg;
   }

   public String getEntidade() {
        return entidade;
   }

   public void setEntidade(String entidade) {
        markAsChanged("ENTIDADE", entidade);
        this.entidade = entidade;
   }

   public BigDecimal getRelevancia() {
        return relevancia;
   }

   public void setRelevancia(BigDecimal relevancia) {
        markAsChanged("RELEVANCIA", relevancia);
        this.relevancia = relevancia;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
        this.tabela = tabela;
   }

   @Override
   public String getTableName() {
        return "TGFTOKCAM";
   }

   @Override
   public String getEntityName() {
        return "CamposTokenProduto";
   }

   @Override
   public CamposTokenProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.campo = vo.asString("CAMPO");
        this.codCfg = vo.asBigDecimal("CODCFG");
        this.entidade = vo.asString("ENTIDADE");
        this.relevancia = vo.asBigDecimal("RELEVANCIA");
        this.tabela = vo.asString("TABELA");
        return this;
   }
}
