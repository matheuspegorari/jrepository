package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Relatorio extends AbstractSankhyaEntity<Relatorio> {
   public String getIdTela() {
        return this.getVo().asString("IDTELA");
   }

   public void setIdTela(String idTela) {
        markAsChanged("IDTELA", idTela);
   }

   public BigDecimal getNuInstancia() {
        return this.getVo().asBigDecimal("NUINSTANCIA");
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
   }

   public BigDecimal getNuRfe() {
        return this.getVo().asBigDecimal("NURFE");
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
   }

   public BigDecimal getNuRfeDependente() {
        return this.getVo().asBigDecimal("NURFEDEPENDENTE");
   }

   public void setNuRfeDependente(BigDecimal nuRfeDependente) {
        markAsChanged("NURFEDEPENDENTE", nuRfeDependente);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getExpFiltroInstancia() {
        return this.getVo().asString("EXPFILTROINSTANCIA");
   }

   public void setExpFiltroInstancia(String expFiltroInstancia) {
        markAsChanged("EXPFILTROINSTANCIA", expFiltroInstancia);
   }

   public String getFormato() {
        return this.getVo().asString("FORMATO");
   }

   public void setFormato(String formato) {
        markAsChanged("FORMATO", formato);
   }

   public String getCategoria() {
        return this.getVo().asString("CATEGORIA");
   }

   public void setCategoria(String categoria) {
        markAsChanged("CATEGORIA", categoria);
   }

   public String getDsName() {
        return this.getVo().asString("DSNAME");
   }

   public void setDsName(String dsName) {
        markAsChanged("DSNAME", dsName);
   }

   public String getPrefixoAnexo() {
        return this.getVo().asString("PREFIXOANEXO");
   }

   public void setPrefixoAnexo(String prefixoAnexo) {
        markAsChanged("PREFIXOANEXO", prefixoAnexo);
   }

   public String getNomeImpressora() {
        return this.getVo().asString("NOMEIMPRESSORA");
   }

   public void setNomeImpressora(String nomeImpressora) {
        markAsChanged("NOMEIMPRESSORA", nomeImpressora);
   }

   @Override
   public String getTableName() {
        return "TSIRFE";
   }

   @Override
   public String getEntityName() {
        return "Relatorio";
   }

   @Override
   public Relatorio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
