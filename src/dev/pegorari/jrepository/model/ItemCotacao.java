package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemCotacao extends AbstractSankhyaEntity<ItemCotacao> {
   public BigDecimal getAliqIcms() {
        return this.getVo().asBigDecimal("ALIQICMS");
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
   }

   public BigDecimal getAliqIpi() {
        return this.getVo().asBigDecimal("ALIQIPI");
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        markAsChanged("ALIQIPI", aliqIpi);
   }

   public String getCabecalho() {
        return this.getVo().asString("CABECALHO");
   }

   public void setCabecalho(String cabecalho) {
        markAsChanged("CABECALHO", cabecalho);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodMoeda() {
        return this.getVo().asBigDecimal("CODMOEDA");
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getConfiabForn() {
        return this.getVo().asBigDecimal("CONFIABFORN");
   }

   public void setConfiabForn(BigDecimal confiabForn) {
        markAsChanged("CONFIABFORN", confiabForn);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getCusGer() {
        return this.getVo().asBigDecimal("CUSGER");
   }

   public void setCusGer(BigDecimal cusGer) {
        markAsChanged("CUSGER", cusGer);
   }

   public BigDecimal getCusMedIcm() {
        return this.getVo().asBigDecimal("CUSMEDICM");
   }

   public void setCusMedIcm(BigDecimal cusMedIcm) {
        markAsChanged("CUSMEDICM", cusMedIcm);
   }

   public BigDecimal getCusRep() {
        return this.getVo().asBigDecimal("CUSREP");
   }

   public void setCusRep(BigDecimal cusRep) {
        markAsChanged("CUSREP", cusRep);
   }

   public BigDecimal getCusSemIcm() {
        return this.getVo().asBigDecimal("CUSSEMICM");
   }

   public void setCusSemIcm(BigDecimal cusSemIcm) {
        markAsChanged("CUSSEMICM", cusSemIcm);
   }

   public BigDecimal getCusVariavel() {
        return this.getVo().asBigDecimal("CUSVARIAVEL");
   }

   public void setCusVariavel(BigDecimal cusVariavel) {
        markAsChanged("CUSVARIAVEL", cusVariavel);
   }

   public BigDecimal getDifAliqIcms() {
        return this.getVo().asBigDecimal("DIFALIQICMS");
   }

   public void setDifAliqIcms(BigDecimal difAliqIcms) {
        markAsChanged("DIFALIQICMS", difAliqIcms);
   }

   public BigDecimal getDiferenciador() {
        return this.getVo().asBigDecimal("DIFERENCIADOR");
   }

   public void setDiferenciador(BigDecimal diferenciador) {
        markAsChanged("DIFERENCIADOR", diferenciador);
   }

   public Timestamp getDtColetaPreco() {
        return this.getVo().asTimestamp("DTCOLETAPRECO");
   }

   public void setDtColetaPreco(Timestamp dtColetaPreco) {
        markAsChanged("DTCOLETAPRECO", dtColetaPreco);
   }

   public Timestamp getDtMoeda() {
        return this.getVo().asTimestamp("DTMOEDA");
   }

   public void setDtMoeda(Timestamp dtMoeda) {
        markAsChanged("DTMOEDA", dtMoeda);
   }

   public BigDecimal getFatMinimo() {
        return this.getVo().asBigDecimal("FATMINIMO");
   }

   public void setFatMinimo(BigDecimal fatMinimo) {
        markAsChanged("FATMINIMO", fatMinimo);
   }

   public BigDecimal getFrete() {
        return this.getVo().asBigDecimal("FRETE");
   }

   public void setFrete(BigDecimal frete) {
        markAsChanged("FRETE", frete);
   }

   public BigDecimal getGarantia() {
        return this.getVo().asBigDecimal("GARANTIA");
   }

   public void setGarantia(BigDecimal garantia) {
        markAsChanged("GARANTIA", garantia);
   }

   public BigDecimal getIcms() {
        return this.getVo().asBigDecimal("ICMS");
   }

   public void setIcms(BigDecimal icms) {
        markAsChanged("ICMS", icms);
   }

   public BigDecimal getIpi() {
        return this.getVo().asBigDecimal("IPI");
   }

   public void setIpi(BigDecimal ipi) {
        markAsChanged("IPI", ipi);
   }

   public String getMelhor() {
        return this.getVo().asString("MELHOR");
   }

   public void setMelhor(String melhor) {
        markAsChanged("MELHOR", melhor);
   }

   public BigDecimal getNumCotacao() {
        return this.getVo().asBigDecimal("NUMCOTACAO");
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
   }

   public String getObs() {
        return this.getVo().asString("OBS");
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
   }

   public BigDecimal getOutros() {
        return this.getVo().asBigDecimal("OUTROS");
   }

   public void setOutros(BigDecimal outros) {
        markAsChanged("OUTROS", outros);
   }

   public BigDecimal getPercAcresc() {
        return this.getVo().asBigDecimal("PERCACRESC");
   }

   public void setPercAcresc(BigDecimal percAcresc) {
        markAsChanged("PERCACRESC", percAcresc);
   }

   public BigDecimal getPercDesc() {
        return this.getVo().asBigDecimal("PERCDESC");
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
   }

   public BigDecimal getPrazoEntrega() {
        return this.getVo().asBigDecimal("PRAZOENTREGA");
   }

   public void setPrazoEntrega(BigDecimal prazoEntrega) {
        markAsChanged("PRAZOENTREGA", prazoEntrega);
   }

   public BigDecimal getPrazoMedio() {
        return this.getVo().asBigDecimal("PRAZOMEDIO");
   }

   public void setPrazoMedio(BigDecimal prazoMedio) {
        markAsChanged("PRAZOMEDIO", prazoMedio);
   }

   public BigDecimal getPrazoValProp() {
        return this.getVo().asBigDecimal("PRAZOVALPROP");
   }

   public void setPrazoValProp(BigDecimal prazoValProp) {
        markAsChanged("PRAZOVALPROP", prazoValProp);
   }

   public BigDecimal getPreco() {
        return this.getVo().asBigDecimal("PRECO");
   }

   public void setPreco(BigDecimal preco) {
        markAsChanged("PRECO", preco);
   }

   public BigDecimal getPrecoCalc() {
        return this.getVo().asBigDecimal("PRECOCALC");
   }

   public void setPrecoCalc(BigDecimal precoCalc) {
        markAsChanged("PRECOCALC", precoCalc);
   }

   public BigDecimal getQtdCotada() {
        return this.getVo().asBigDecimal("QTDCOTADA");
   }

   public void setQtdCotada(BigDecimal qtdCotada) {
        markAsChanged("QTDCOTADA", qtdCotada);
   }

   public BigDecimal getQualAtend() {
        return this.getVo().asBigDecimal("QUALATEND");
   }

   public void setQualAtend(BigDecimal qualAtend) {
        markAsChanged("QUALATEND", qualAtend);
   }

   public BigDecimal getQualProd() {
        return this.getVo().asBigDecimal("QUALPROD");
   }

   public void setQualProd(BigDecimal qualProd) {
        markAsChanged("QUALPROD", qualProd);
   }

   public BigDecimal getResultCot() {
        return this.getVo().asBigDecimal("RESULTCOT");
   }

   public void setResultCot(BigDecimal resultCot) {
        markAsChanged("RESULTCOT", resultCot);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public BigDecimal getTaxaJuro() {
        return this.getVo().asBigDecimal("TAXAJURO");
   }

   public void setTaxaJuro(BigDecimal taxaJuro) {
        markAsChanged("TAXAJURO", taxaJuro);
   }

   public BigDecimal getVlrAcresc() {
        return this.getVo().asBigDecimal("VLRACRESC");
   }

   public void setVlrAcresc(BigDecimal vlrAcresc) {
        markAsChanged("VLRACRESC", vlrAcresc);
   }

   public BigDecimal getVlrDesc() {
        return this.getVo().asBigDecimal("VLRDESC");
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
   }

   public BigDecimal getVlrMoeda() {
        return this.getVo().asBigDecimal("VLRMOEDA");
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        markAsChanged("VLRMOEDA", vlrMoeda);
   }

   public BigDecimal getVlrSubst() {
        return this.getVo().asBigDecimal("VLRSUBST");
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
   }

   public Timestamp getDhEntrega() {
        return this.getVo().asTimestamp("DHENTREGA");
   }

   public void setDhEntrega(Timestamp dhEntrega) {
        markAsChanged("DHENTREGA", dhEntrega);
   }

   public BigDecimal getCustoFinal() {
        return this.getVo().asBigDecimal("CUSTOFINAL");
   }

   public void setCustoFinal(BigDecimal custoFinal) {
        markAsChanged("CUSTOFINAL", custoFinal);
   }

   public String getModFrete() {
        return this.getVo().asString("MODFRETE");
   }

   public void setModFrete(String modFrete) {
        markAsChanged("MODFRETE", modFrete);
   }

   public BigDecimal getPrecoMoe() {
        return this.getVo().asBigDecimal("PRECOMOE");
   }

   public void setPrecoMoe(BigDecimal precoMoe) {
        markAsChanged("PRECOMOE", precoMoe);
   }

   public BigDecimal getValProposta() {
        return this.getVo().asBigDecimal("VALPROPOSTA");
   }

   public void setValProposta(BigDecimal valProposta) {
        markAsChanged("VALPROPOSTA", valProposta);
   }

   public BigDecimal getVlrDescMoe() {
        return this.getVo().asBigDecimal("VLRDESCMOE");
   }

   public void setVlrDescMoe(BigDecimal vlrDescMoe) {
        markAsChanged("VLRDESCMOE", vlrDescMoe);
   }

   public BigDecimal getEmpresa() {
        return this.getVo().asBigDecimal("EMPRESA");
   }

   public void setEmpresa(BigDecimal empresa) {
        markAsChanged("EMPRESA", empresa);
   }

   public BigDecimal getNumeroOs() {
        return this.getVo().asBigDecimal("NUMEROOS");
   }

   public void setNumeroOs(BigDecimal numeroOs) {
        markAsChanged("NUMEROOS", numeroOs);
   }

   public BigDecimal getCodProdEsp() {
        return this.getVo().asBigDecimal("CODPRODESP");
   }

   public void setCodProdEsp(BigDecimal codProdEsp) {
        markAsChanged("CODPRODESP", codProdEsp);
   }

   public BigDecimal getFornecAprovado() {
        return this.getVo().asBigDecimal("FORNECAPROVADO");
   }

   public void setFornecAprovado(BigDecimal fornecAprovado) {
        markAsChanged("FORNECAPROVADO", fornecAprovado);
   }

   public BigDecimal getSeqNotaCpa() {
        return this.getVo().asBigDecimal("SEQNOTACPA");
   }

   public void setSeqNotaCpa(BigDecimal seqNotaCpa) {
        markAsChanged("SEQNOTACPA", seqNotaCpa);
   }

   public String getStatusPrecificacao() {
        return this.getVo().asString("STATUSPRECIFICACAO");
   }

   public void setStatusPrecificacao(String statusPrecificacao) {
        markAsChanged("STATUSPRECIFICACAO", statusPrecificacao);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getUsuResp() {
        return this.getVo().asBigDecimal("USURESP");
   }

   public void setUsuResp(BigDecimal usuResp) {
        markAsChanged("USURESP", usuResp);
   }

   public String getStatusEnvio() {
        return this.getVo().asString("STATUSENVIO");
   }

   public void setStatusEnvio(String statusEnvio) {
        markAsChanged("STATUSENVIO", statusEnvio);
   }

   public Timestamp getDhFinal() {
        return this.getVo().asTimestamp("DHFINAL");
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
   }

   public BigDecimal getProdAgrupMin() {
        return this.getVo().asBigDecimal("PRODAGRUPMIN");
   }

   public void setProdAgrupMin(BigDecimal prodAgrupMin) {
        markAsChanged("PRODAGRUPMIN", prodAgrupMin);
   }

   public BigDecimal getProdDecQtd() {
        return this.getVo().asBigDecimal("PRODDECQTD");
   }

   public void setProdDecQtd(BigDecimal prodDecQtd) {
        markAsChanged("PRODDECQTD", prodDecQtd);
   }

   public BigDecimal getUltCusGer() {
        return this.getVo().asBigDecimal("ULTCUSGER");
   }

   public void setUltCusGer(BigDecimal ultCusGer) {
        markAsChanged("ULTCUSGER", ultCusGer);
   }

   public BigDecimal getMelhorPreco() {
        return this.getVo().asBigDecimal("MELHORPRECO");
   }

   public void setMelhorPreco(BigDecimal melhorPreco) {
        markAsChanged("MELHORPRECO", melhorPreco);
   }

   public Timestamp getDhInicial() {
        return this.getVo().asTimestamp("DHINICIAL");
   }

   public void setDhInicial(Timestamp dhInicial) {
        markAsChanged("DHINICIAL", dhInicial);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public BigDecimal getUltCusVar() {
        return this.getVo().asBigDecimal("ULTCUSVAR");
   }

   public void setUltCusVar(BigDecimal ultCusVar) {
        markAsChanged("ULTCUSVAR", ultCusVar);
   }

   public BigDecimal getTotalParceiros() {
        return this.getVo().asBigDecimal("TOTALPARCEIROS");
   }

   public void setTotalParceiros(BigDecimal totalParceiros) {
        markAsChanged("TOTALPARCEIROS", totalParceiros);
   }

   public BigDecimal getCentResult() {
        return this.getVo().asBigDecimal("CENTRESULT");
   }

   public void setCentResult(BigDecimal centResult) {
        markAsChanged("CENTRESULT", centResult);
   }

   public BigDecimal getUltCusRep() {
        return this.getVo().asBigDecimal("ULTCUSREP");
   }

   public void setUltCusRep(BigDecimal ultCusRep) {
        markAsChanged("ULTCUSREP", ultCusRep);
   }

   public BigDecimal getPrazoParc() {
        return this.getVo().asBigDecimal("PRAZOPARC");
   }

   public void setPrazoParc(BigDecimal prazoParc) {
        markAsChanged("PRAZOPARC", prazoParc);
   }

   public Timestamp getDtLimPreco() {
        return this.getVo().asTimestamp("DTLIMPRECO");
   }

   public void setDtLimPreco(Timestamp dtLimPreco) {
        markAsChanged("DTLIMPRECO", dtLimPreco);
   }

   public BigDecimal getRespMinCot() {
        return this.getVo().asBigDecimal("RESPMINCOT");
   }

   public void setRespMinCot(BigDecimal respMinCot) {
        markAsChanged("RESPMINCOT", respMinCot);
   }

   public Timestamp getDtLimite() {
        return this.getVo().asTimestamp("DTLIMITE");
   }

   public void setDtLimite(Timestamp dtLimite) {
        markAsChanged("DTLIMITE", dtLimite);
   }

   public Timestamp getDtEnvioCot() {
        return this.getVo().asTimestamp("DTENVIOCOT");
   }

   public void setDtEnvioCot(Timestamp dtEnvioCot) {
        markAsChanged("DTENVIOCOT", dtEnvioCot);
   }

   public BigDecimal getSeqItemCot() {
        return this.getVo().asBigDecimal("SEQITEMCOT");
   }

   public void setSeqItemCot(BigDecimal seqItemCot) {
        markAsChanged("SEQITEMCOT", seqItemCot);
   }

   public String getStatusProdCot() {
        return this.getVo().asString("STATUSPRODCOT");
   }

   public void setStatusProdCot(String statusProdCot) {
        markAsChanged("STATUSPRODCOT", statusProdCot);
   }

   public BigDecimal getUsuSol() {
        return this.getVo().asBigDecimal("USUSOL");
   }

   public void setUsuSol(BigDecimal usuSol) {
        markAsChanged("USUSOL", usuSol);
   }

   public BigDecimal getMelhorFornEc() {
        return this.getVo().asBigDecimal("MELHORFORNEC");
   }

   public void setMelhorFornEc(BigDecimal melhorFornEc) {
        markAsChanged("MELHORFORNEC", melhorFornEc);
   }

   public BigDecimal getNuNotaCpa() {
        return this.getVo().asBigDecimal("NUNOTACPA");
   }

   public void setNuNotaCpa(BigDecimal nuNotaCpa) {
        markAsChanged("NUNOTACPA", nuNotaCpa);
   }

   public BigDecimal getTotalProduto() {
        return this.getVo().asBigDecimal("TOTALPRODUTO");
   }

   public void setTotalProduto(BigDecimal totalProduto) {
        markAsChanged("TOTALPRODUTO", totalProduto);
   }

   public BigDecimal getQtdParcPagt() {
        return this.getVo().asBigDecimal("QTDPARCPAGT");
   }

   public void setQtdParcPagt(BigDecimal qtdParcPagt) {
        markAsChanged("QTDPARCPAGT", qtdParcPagt);
   }

   public String getCondPagt() {
        return this.getVo().asString("CONDPAGT");
   }

   public void setCondPagt(String condPagt) {
        markAsChanged("CONDPAGT", condPagt);
   }

   public BigDecimal getUltVlrUnitComp() {
        return this.getVo().asBigDecimal("ULTVLRUNITCOMP");
   }

   public void setUltVlrUnitComp(BigDecimal ultVlrUnitComp) {
        markAsChanged("ULTVLRUNITCOMP", ultVlrUnitComp);
   }

   public BigDecimal getProdDecVlr() {
        return this.getVo().asBigDecimal("PRODDECVLR");
   }

   public void setProdDecVlr(BigDecimal prodDecVlr) {
        markAsChanged("PRODDECVLR", prodDecVlr);
   }

   public String getTipoColPreco() {
        return this.getVo().asString("TIPOCOLPRECO");
   }

   public void setTipoColPreco(String tipoColPreco) {
        markAsChanged("TIPOCOLPRECO", tipoColPreco);
   }

   public BigDecimal getCodMotCan() {
        return this.getVo().asBigDecimal("CODMOTCAN");
   }

   public void setCodMotCan(BigDecimal codMotCan) {
        markAsChanged("CODMOTCAN", codMotCan);
   }

   public String getComplDesc() {
        return this.getVo().asString("COMPLDESC");
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
   }

   public String getObsMotCanc() {
        return this.getVo().asString("OBSMOTCANC");
   }

   public void setObsMotCanc(String obsMotCanc) {
        markAsChanged("OBSMOTCANC", obsMotCanc);
   }

   @Override
   public String getTableName() {
        return "TGFITC";
   }

   @Override
   public String getEntityName() {
        return "ItemCotacao";
   }

   @Override
   public ItemCotacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
