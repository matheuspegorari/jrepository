package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegraNegocio extends AbstractSankhyaEntity<RegraNegocio> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodUsuLib() {
        return this.getVo().asBigDecimal("CODUSULIB");
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        markAsChanged("CODUSULIB", codUsuLib);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getEvento() {
        return this.getVo().asBigDecimal("EVENTO");
   }

   public void setEvento(BigDecimal evento) {
        markAsChanged("EVENTO", evento);
   }

   public String getExpressao() {
        return this.getVo().asString("EXPRESSAO");
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
   }

   public BigDecimal getNuRng() {
        return this.getVo().asBigDecimal("NURNG");
   }

   public void setNuRng(BigDecimal nuRng) {
        markAsChanged("NURNG", nuRng);
   }

   public String getOnde() {
        return this.getVo().asString("ONDE");
   }

   public void setOnde(String onde) {
        markAsChanged("ONDE", onde);
   }

   public String getQuando() {
        return this.getVo().asString("QUANDO");
   }

   public void setQuando(String quando) {
        markAsChanged("QUANDO", quando);
   }

   public String getTipoExpressao() {
        return this.getVo().asString("TIPOEXPRESSAO");
   }

   public void setTipoExpressao(String tipoExpressao) {
        markAsChanged("TIPOEXPRESSAO", tipoExpressao);
   }

   public String getInibeLib() {
        return this.getVo().asString("INIBELIB");
   }

   public void setInibeLib(String inibeLib) {
        markAsChanged("INIBELIB", inibeLib);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   @Override
   public String getTableName() {
        return "TGFRNG";
   }

   @Override
   public String getEntityName() {
        return "RegraNegocio";
   }

   @Override
   public RegraNegocio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
