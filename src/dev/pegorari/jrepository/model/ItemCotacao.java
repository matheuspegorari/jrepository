package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemCotacao implements SankhyaEntity<ItemCotacao> {

   private BigDecimal aliqIcms;
   private BigDecimal aliqIpi;
   private String cabecalho;
   private BigDecimal codContato;
   private BigDecimal codLocal;
   private BigDecimal codMoeda;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codTipVenda;
   private String codVol;
   private BigDecimal confiabForn;
   private String controle;
   private BigDecimal cusGer;
   private BigDecimal cusMedIcm;
   private BigDecimal cusRep;
   private BigDecimal cusSemIcm;
   private BigDecimal cusVariavel;
   private BigDecimal difAliqIcms;
   private BigDecimal diferenciador;
   private Timestamp dtColetaPreco;
   private Timestamp dtMoeda;
   private BigDecimal fatMinimo;
   private BigDecimal frete;
   private BigDecimal garantia;
   private BigDecimal icms;
   private BigDecimal ipi;
   private String melhor;
   private BigDecimal numCotacao;
   private String obs;
   private BigDecimal outros;
   private BigDecimal percAcresc;
   private BigDecimal percDesc;
   private BigDecimal prazoEntrega;
   private BigDecimal prazoMedio;
   private BigDecimal prazoValProp;
   private BigDecimal preco;
   private BigDecimal precoCalc;
   private BigDecimal qtdCotada;
   private BigDecimal qualAtend;
   private BigDecimal qualProd;
   private BigDecimal resultCot;
   private String situacao;
   private BigDecimal taxaJuro;
   private BigDecimal vlrAcresc;
   private BigDecimal vlrDesc;
   private BigDecimal vlrMoeda;
   private BigDecimal vlrSubst;
   private Timestamp dhEntrega;
   private BigDecimal custoFinal;
   private String modFrete;
   private BigDecimal precoMoe;
   private BigDecimal valProposta;
   private BigDecimal vlrDescMoe;
   private BigDecimal empresa;
   private BigDecimal numeroOs;
   private BigDecimal codProdEsp;
   private BigDecimal fornecAprovado;
   private BigDecimal seqNotaCpa;
   private String statusPrecificacao;
   private BigDecimal codNat;
   private BigDecimal usuResp;
   private String statusEnvio;
   private Timestamp dhFinal;
   private BigDecimal prodAgrupMin;
   private BigDecimal prodDecQtd;
   private BigDecimal ultCusGer;
   private BigDecimal melhorPreco;
   private Timestamp dhInicial;
   private BigDecimal codProj;
   private String marca;
   private BigDecimal ultCusVar;
   private BigDecimal totalParceiros;
   private BigDecimal centResult;
   private BigDecimal ultCusRep;
   private BigDecimal prazoParc;
   private Timestamp dtLimPreco;
   private BigDecimal respMinCot;
   private Timestamp dtLimite;
   private Timestamp dtEnvioCot;
   private BigDecimal seqItemCot;
   private String statusProdCot;
   private BigDecimal usuSol;
   private BigDecimal melhorFornEc;
   private BigDecimal nuNotaCpa;
   private BigDecimal totalProduto;
   private BigDecimal qtdParcPagt;
   private String condPagt;
   private BigDecimal ultVlrUnitComp;
   private BigDecimal prodDecVlr;
   private String tipoColPreco;
   private BigDecimal codMotCan;
   private String complDesc;
   private String obsMotCanc;

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getAliqIpi() {
        return aliqIpi;
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        this.aliqIpi = aliqIpi;
   }

   public String getCabecalho() {
        return cabecalho;
   }

   public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        this.codTipVenda = codTipVenda;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public BigDecimal getConfiabForn() {
        return confiabForn;
   }

   public void setConfiabForn(BigDecimal confiabForn) {
        this.confiabForn = confiabForn;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public BigDecimal getCusGer() {
        return cusGer;
   }

   public void setCusGer(BigDecimal cusGer) {
        this.cusGer = cusGer;
   }

   public BigDecimal getCusMedIcm() {
        return cusMedIcm;
   }

   public void setCusMedIcm(BigDecimal cusMedIcm) {
        this.cusMedIcm = cusMedIcm;
   }

   public BigDecimal getCusRep() {
        return cusRep;
   }

   public void setCusRep(BigDecimal cusRep) {
        this.cusRep = cusRep;
   }

   public BigDecimal getCusSemIcm() {
        return cusSemIcm;
   }

   public void setCusSemIcm(BigDecimal cusSemIcm) {
        this.cusSemIcm = cusSemIcm;
   }

   public BigDecimal getCusVariavel() {
        return cusVariavel;
   }

   public void setCusVariavel(BigDecimal cusVariavel) {
        this.cusVariavel = cusVariavel;
   }

   public BigDecimal getDifAliqIcms() {
        return difAliqIcms;
   }

   public void setDifAliqIcms(BigDecimal difAliqIcms) {
        this.difAliqIcms = difAliqIcms;
   }

   public BigDecimal getDiferenciador() {
        return diferenciador;
   }

   public void setDiferenciador(BigDecimal diferenciador) {
        this.diferenciador = diferenciador;
   }

   public Timestamp getDtColetaPreco() {
        return dtColetaPreco;
   }

   public void setDtColetaPreco(Timestamp dtColetaPreco) {
        this.dtColetaPreco = dtColetaPreco;
   }

   public Timestamp getDtMoeda() {
        return dtMoeda;
   }

   public void setDtMoeda(Timestamp dtMoeda) {
        this.dtMoeda = dtMoeda;
   }

   public BigDecimal getFatMinimo() {
        return fatMinimo;
   }

   public void setFatMinimo(BigDecimal fatMinimo) {
        this.fatMinimo = fatMinimo;
   }

   public BigDecimal getFrete() {
        return frete;
   }

   public void setFrete(BigDecimal frete) {
        this.frete = frete;
   }

   public BigDecimal getGarantia() {
        return garantia;
   }

   public void setGarantia(BigDecimal garantia) {
        this.garantia = garantia;
   }

   public BigDecimal getIcms() {
        return icms;
   }

   public void setIcms(BigDecimal icms) {
        this.icms = icms;
   }

   public BigDecimal getIpi() {
        return ipi;
   }

   public void setIpi(BigDecimal ipi) {
        this.ipi = ipi;
   }

   public String getMelhor() {
        return melhor;
   }

   public void setMelhor(String melhor) {
        this.melhor = melhor;
   }

   public BigDecimal getNumCotacao() {
        return numCotacao;
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        this.numCotacao = numCotacao;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        this.obs = obs;
   }

   public BigDecimal getOutros() {
        return outros;
   }

   public void setOutros(BigDecimal outros) {
        this.outros = outros;
   }

   public BigDecimal getPercAcresc() {
        return percAcresc;
   }

   public void setPercAcresc(BigDecimal percAcresc) {
        this.percAcresc = percAcresc;
   }

   public BigDecimal getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(BigDecimal percDesc) {
        this.percDesc = percDesc;
   }

   public BigDecimal getPrazoEntrega() {
        return prazoEntrega;
   }

   public void setPrazoEntrega(BigDecimal prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
   }

   public BigDecimal getPrazoMedio() {
        return prazoMedio;
   }

   public void setPrazoMedio(BigDecimal prazoMedio) {
        this.prazoMedio = prazoMedio;
   }

   public BigDecimal getPrazoValProp() {
        return prazoValProp;
   }

   public void setPrazoValProp(BigDecimal prazoValProp) {
        this.prazoValProp = prazoValProp;
   }

   public BigDecimal getPreco() {
        return preco;
   }

   public void setPreco(BigDecimal preco) {
        this.preco = preco;
   }

   public BigDecimal getPrecoCalc() {
        return precoCalc;
   }

   public void setPrecoCalc(BigDecimal precoCalc) {
        this.precoCalc = precoCalc;
   }

   public BigDecimal getQtdCotada() {
        return qtdCotada;
   }

   public void setQtdCotada(BigDecimal qtdCotada) {
        this.qtdCotada = qtdCotada;
   }

   public BigDecimal getQualAtend() {
        return qualAtend;
   }

   public void setQualAtend(BigDecimal qualAtend) {
        this.qualAtend = qualAtend;
   }

   public BigDecimal getQualProd() {
        return qualProd;
   }

   public void setQualProd(BigDecimal qualProd) {
        this.qualProd = qualProd;
   }

   public BigDecimal getResultCot() {
        return resultCot;
   }

   public void setResultCot(BigDecimal resultCot) {
        this.resultCot = resultCot;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public BigDecimal getTaxaJuro() {
        return taxaJuro;
   }

   public void setTaxaJuro(BigDecimal taxaJuro) {
        this.taxaJuro = taxaJuro;
   }

   public BigDecimal getVlrAcresc() {
        return vlrAcresc;
   }

   public void setVlrAcresc(BigDecimal vlrAcresc) {
        this.vlrAcresc = vlrAcresc;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        this.vlrDesc = vlrDesc;
   }

   public BigDecimal getVlrMoeda() {
        return vlrMoeda;
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        this.vlrMoeda = vlrMoeda;
   }

   public BigDecimal getVlrSubst() {
        return vlrSubst;
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        this.vlrSubst = vlrSubst;
   }

   public Timestamp getDhEntrega() {
        return dhEntrega;
   }

   public void setDhEntrega(Timestamp dhEntrega) {
        this.dhEntrega = dhEntrega;
   }

   public BigDecimal getCustoFinal() {
        return custoFinal;
   }

   public void setCustoFinal(BigDecimal custoFinal) {
        this.custoFinal = custoFinal;
   }

   public String getModFrete() {
        return modFrete;
   }

   public void setModFrete(String modFrete) {
        this.modFrete = modFrete;
   }

   public BigDecimal getPrecoMoe() {
        return precoMoe;
   }

   public void setPrecoMoe(BigDecimal precoMoe) {
        this.precoMoe = precoMoe;
   }

   public BigDecimal getValProposta() {
        return valProposta;
   }

   public void setValProposta(BigDecimal valProposta) {
        this.valProposta = valProposta;
   }

   public BigDecimal getVlrDescMoe() {
        return vlrDescMoe;
   }

   public void setVlrDescMoe(BigDecimal vlrDescMoe) {
        this.vlrDescMoe = vlrDescMoe;
   }

   public BigDecimal getEmpresa() {
        return empresa;
   }

   public void setEmpresa(BigDecimal empresa) {
        this.empresa = empresa;
   }

   public BigDecimal getNumeroOs() {
        return numeroOs;
   }

   public void setNumeroOs(BigDecimal numeroOs) {
        this.numeroOs = numeroOs;
   }

   public BigDecimal getCodProdEsp() {
        return codProdEsp;
   }

   public void setCodProdEsp(BigDecimal codProdEsp) {
        this.codProdEsp = codProdEsp;
   }

   public BigDecimal getFornecAprovado() {
        return fornecAprovado;
   }

   public void setFornecAprovado(BigDecimal fornecAprovado) {
        this.fornecAprovado = fornecAprovado;
   }

   public BigDecimal getSeqNotaCpa() {
        return seqNotaCpa;
   }

   public void setSeqNotaCpa(BigDecimal seqNotaCpa) {
        this.seqNotaCpa = seqNotaCpa;
   }

   public String getStatusPrecificacao() {
        return statusPrecificacao;
   }

   public void setStatusPrecificacao(String statusPrecificacao) {
        this.statusPrecificacao = statusPrecificacao;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getUsuResp() {
        return usuResp;
   }

   public void setUsuResp(BigDecimal usuResp) {
        this.usuResp = usuResp;
   }

   public String getStatusEnvio() {
        return statusEnvio;
   }

   public void setStatusEnvio(String statusEnvio) {
        this.statusEnvio = statusEnvio;
   }

   public Timestamp getDhFinal() {
        return dhFinal;
   }

   public void setDhFinal(Timestamp dhFinal) {
        this.dhFinal = dhFinal;
   }

   public BigDecimal getProdAgrupMin() {
        return prodAgrupMin;
   }

   public void setProdAgrupMin(BigDecimal prodAgrupMin) {
        this.prodAgrupMin = prodAgrupMin;
   }

   public BigDecimal getProdDecQtd() {
        return prodDecQtd;
   }

   public void setProdDecQtd(BigDecimal prodDecQtd) {
        this.prodDecQtd = prodDecQtd;
   }

   public BigDecimal getUltCusGer() {
        return ultCusGer;
   }

   public void setUltCusGer(BigDecimal ultCusGer) {
        this.ultCusGer = ultCusGer;
   }

   public BigDecimal getMelhorPreco() {
        return melhorPreco;
   }

   public void setMelhorPreco(BigDecimal melhorPreco) {
        this.melhorPreco = melhorPreco;
   }

   public Timestamp getDhInicial() {
        return dhInicial;
   }

   public void setDhInicial(Timestamp dhInicial) {
        this.dhInicial = dhInicial;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        this.marca = marca;
   }

   public BigDecimal getUltCusVar() {
        return ultCusVar;
   }

   public void setUltCusVar(BigDecimal ultCusVar) {
        this.ultCusVar = ultCusVar;
   }

   public BigDecimal getTotalParceiros() {
        return totalParceiros;
   }

   public void setTotalParceiros(BigDecimal totalParceiros) {
        this.totalParceiros = totalParceiros;
   }

   public BigDecimal getCentResult() {
        return centResult;
   }

   public void setCentResult(BigDecimal centResult) {
        this.centResult = centResult;
   }

   public BigDecimal getUltCusRep() {
        return ultCusRep;
   }

   public void setUltCusRep(BigDecimal ultCusRep) {
        this.ultCusRep = ultCusRep;
   }

   public BigDecimal getPrazoParc() {
        return prazoParc;
   }

   public void setPrazoParc(BigDecimal prazoParc) {
        this.prazoParc = prazoParc;
   }

   public Timestamp getDtLimPreco() {
        return dtLimPreco;
   }

   public void setDtLimPreco(Timestamp dtLimPreco) {
        this.dtLimPreco = dtLimPreco;
   }

   public BigDecimal getRespMinCot() {
        return respMinCot;
   }

   public void setRespMinCot(BigDecimal respMinCot) {
        this.respMinCot = respMinCot;
   }

   public Timestamp getDtLimite() {
        return dtLimite;
   }

   public void setDtLimite(Timestamp dtLimite) {
        this.dtLimite = dtLimite;
   }

   public Timestamp getDtEnvioCot() {
        return dtEnvioCot;
   }

   public void setDtEnvioCot(Timestamp dtEnvioCot) {
        this.dtEnvioCot = dtEnvioCot;
   }

   public BigDecimal getSeqItemCot() {
        return seqItemCot;
   }

   public void setSeqItemCot(BigDecimal seqItemCot) {
        this.seqItemCot = seqItemCot;
   }

   public String getStatusProdCot() {
        return statusProdCot;
   }

   public void setStatusProdCot(String statusProdCot) {
        this.statusProdCot = statusProdCot;
   }

   public BigDecimal getUsuSol() {
        return usuSol;
   }

   public void setUsuSol(BigDecimal usuSol) {
        this.usuSol = usuSol;
   }

   public BigDecimal getMelhorFornEc() {
        return melhorFornEc;
   }

   public void setMelhorFornEc(BigDecimal melhorFornEc) {
        this.melhorFornEc = melhorFornEc;
   }

   public BigDecimal getNuNotaCpa() {
        return nuNotaCpa;
   }

   public void setNuNotaCpa(BigDecimal nuNotaCpa) {
        this.nuNotaCpa = nuNotaCpa;
   }

   public BigDecimal getTotalProduto() {
        return totalProduto;
   }

   public void setTotalProduto(BigDecimal totalProduto) {
        this.totalProduto = totalProduto;
   }

   public BigDecimal getQtdParcPagt() {
        return qtdParcPagt;
   }

   public void setQtdParcPagt(BigDecimal qtdParcPagt) {
        this.qtdParcPagt = qtdParcPagt;
   }

   public String getCondPagt() {
        return condPagt;
   }

   public void setCondPagt(String condPagt) {
        this.condPagt = condPagt;
   }

   public BigDecimal getUltVlrUnitComp() {
        return ultVlrUnitComp;
   }

   public void setUltVlrUnitComp(BigDecimal ultVlrUnitComp) {
        this.ultVlrUnitComp = ultVlrUnitComp;
   }

   public BigDecimal getProdDecVlr() {
        return prodDecVlr;
   }

   public void setProdDecVlr(BigDecimal prodDecVlr) {
        this.prodDecVlr = prodDecVlr;
   }

   public String getTipoColPreco() {
        return tipoColPreco;
   }

   public void setTipoColPreco(String tipoColPreco) {
        this.tipoColPreco = tipoColPreco;
   }

   public BigDecimal getCodMotCan() {
        return codMotCan;
   }

   public void setCodMotCan(BigDecimal codMotCan) {
        this.codMotCan = codMotCan;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        this.complDesc = complDesc;
   }

   public String getObsMotCanc() {
        return obsMotCanc;
   }

   public void setObsMotCanc(String obsMotCanc) {
        this.obsMotCanc = obsMotCanc;
   }

   @Override
   public String getEntityName() {
        return "ItemCotacao";
   }

   @Override
   public ItemCotacao fromVO(DynamicVO vo) {
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.aliqIpi = vo.asBigDecimal("ALIQIPI");
        this.cabecalho = vo.asString("CABECALHO");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.codVol = vo.asString("CODVOL");
        this.confiabForn = vo.asBigDecimal("CONFIABFORN");
        this.controle = vo.asString("CONTROLE");
        this.cusGer = vo.asBigDecimal("CUSGER");
        this.cusMedIcm = vo.asBigDecimal("CUSMEDICM");
        this.cusRep = vo.asBigDecimal("CUSREP");
        this.cusSemIcm = vo.asBigDecimal("CUSSEMICM");
        this.cusVariavel = vo.asBigDecimal("CUSVARIAVEL");
        this.difAliqIcms = vo.asBigDecimal("DIFALIQICMS");
        this.diferenciador = vo.asBigDecimal("DIFERENCIADOR");
        this.dtColetaPreco = vo.asTimestamp("DTCOLETAPRECO");
        this.dtMoeda = vo.asTimestamp("DTMOEDA");
        this.fatMinimo = vo.asBigDecimal("FATMINIMO");
        this.frete = vo.asBigDecimal("FRETE");
        this.garantia = vo.asBigDecimal("GARANTIA");
        this.icms = vo.asBigDecimal("ICMS");
        this.ipi = vo.asBigDecimal("IPI");
        this.melhor = vo.asString("MELHOR");
        this.numCotacao = vo.asBigDecimal("NUMCOTACAO");
        this.obs = vo.asString("OBS");
        this.outros = vo.asBigDecimal("OUTROS");
        this.percAcresc = vo.asBigDecimal("PERCACRESC");
        this.percDesc = vo.asBigDecimal("PERCDESC");
        this.prazoEntrega = vo.asBigDecimal("PRAZOENTREGA");
        this.prazoMedio = vo.asBigDecimal("PRAZOMEDIO");
        this.prazoValProp = vo.asBigDecimal("PRAZOVALPROP");
        this.preco = vo.asBigDecimal("PRECO");
        this.precoCalc = vo.asBigDecimal("PRECOCALC");
        this.qtdCotada = vo.asBigDecimal("QTDCOTADA");
        this.qualAtend = vo.asBigDecimal("QUALATEND");
        this.qualProd = vo.asBigDecimal("QUALPROD");
        this.resultCot = vo.asBigDecimal("RESULTCOT");
        this.situacao = vo.asString("SITUACAO");
        this.taxaJuro = vo.asBigDecimal("TAXAJURO");
        this.vlrAcresc = vo.asBigDecimal("VLRACRESC");
        this.vlrDesc = vo.asBigDecimal("VLRDESC");
        this.vlrMoeda = vo.asBigDecimal("VLRMOEDA");
        this.vlrSubst = vo.asBigDecimal("VLRSUBST");
        this.dhEntrega = vo.asTimestamp("DHENTREGA");
        this.custoFinal = vo.asBigDecimal("CUSTOFINAL");
        this.modFrete = vo.asString("MODFRETE");
        this.precoMoe = vo.asBigDecimal("PRECOMOE");
        this.valProposta = vo.asBigDecimal("VALPROPOSTA");
        this.vlrDescMoe = vo.asBigDecimal("VLRDESCMOE");
        this.empresa = vo.asBigDecimal("EMPRESA");
        this.numeroOs = vo.asBigDecimal("NUMEROOS");
        this.codProdEsp = vo.asBigDecimal("CODPRODESP");
        this.fornecAprovado = vo.asBigDecimal("FORNECAPROVADO");
        this.seqNotaCpa = vo.asBigDecimal("SEQNOTACPA");
        this.statusPrecificacao = vo.asString("STATUSPRECIFICACAO");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.usuResp = vo.asBigDecimal("USURESP");
        this.statusEnvio = vo.asString("STATUSENVIO");
        this.dhFinal = vo.asTimestamp("DHFINAL");
        this.prodAgrupMin = vo.asBigDecimal("PRODAGRUPMIN");
        this.prodDecQtd = vo.asBigDecimal("PRODDECQTD");
        this.ultCusGer = vo.asBigDecimal("ULTCUSGER");
        this.melhorPreco = vo.asBigDecimal("MELHORPRECO");
        this.dhInicial = vo.asTimestamp("DHINICIAL");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.marca = vo.asString("MARCA");
        this.ultCusVar = vo.asBigDecimal("ULTCUSVAR");
        this.totalParceiros = vo.asBigDecimal("TOTALPARCEIROS");
        this.centResult = vo.asBigDecimal("CENTRESULT");
        this.ultCusRep = vo.asBigDecimal("ULTCUSREP");
        this.prazoParc = vo.asBigDecimal("PRAZOPARC");
        this.dtLimPreco = vo.asTimestamp("DTLIMPRECO");
        this.respMinCot = vo.asBigDecimal("RESPMINCOT");
        this.dtLimite = vo.asTimestamp("DTLIMITE");
        this.dtEnvioCot = vo.asTimestamp("DTENVIOCOT");
        this.seqItemCot = vo.asBigDecimal("SEQITEMCOT");
        this.statusProdCot = vo.asString("STATUSPRODCOT");
        this.usuSol = vo.asBigDecimal("USUSOL");
        this.melhorFornEc = vo.asBigDecimal("MELHORFORNEC");
        this.nuNotaCpa = vo.asBigDecimal("NUNOTACPA");
        this.totalProduto = vo.asBigDecimal("TOTALPRODUTO");
        this.qtdParcPagt = vo.asBigDecimal("QTDPARCPAGT");
        this.condPagt = vo.asString("CONDPAGT");
        this.ultVlrUnitComp = vo.asBigDecimal("ULTVLRUNITCOMP");
        this.prodDecVlr = vo.asBigDecimal("PRODDECVLR");
        this.tipoColPreco = vo.asString("TIPOCOLPRECO");
        this.codMotCan = vo.asBigDecimal("CODMOTCAN");
        this.complDesc = vo.asString("COMPLDESC");
        this.obsMotCanc = vo.asString("OBSMOTCANC");
        return this;
   }
}
